package services

import java.util.concurrent.atomic.AtomicInteger

import javax.inject._

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.List

import play.api.Logger





@Singleton
class Calc {
  val operations = new ArrayBuffer[String]()
  val results = new ArrayBuffer[String]()
  var res=0
  var calc=0


  def run(s:String):Double= {
    operations+= s
    val res =compute(shaunting(tokenize(lexemize(s))))
    results += res.toString
    return res

  }
  def getOperation(): String = {
    if (operations.isEmpty) {
        "No calculations in memory"
    } else {
    if (calc >= operations.length) {
      operations.head
    } else {
      calc+=1
      operations(operations.length - calc)
    }
  }
  }
  def getResult(): String = {
    if (results.isEmpty) {
      "No calculations in memory"
    } else {
      if (res >= results.length) {
        results.head
      } else {
        res+=1
        results(results.length - res)
      }
    }
  }

  def reset():String={
    calc=0
    res=0
    return "Done reseting"
  }
  def clearMemory():String={
    operations.clear()
    results.clear()
    "Memory clear"
  }

  def lexemize(s:String):ArrayBuffer[String]={
    val arrayBuffer = new ArrayBuffer[String]()
    var start=0
    var end=0
    for(i<-0 until s.length){
      s.charAt(i) match {
        case ':'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }

          arrayBuffer+=":"
          start=i+1
        }
        case '/'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }

          arrayBuffer+=":"
          start=i+1
        }
        case '*'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }
          arrayBuffer+="*"
          start=i+1
        }
        case '-'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }
          arrayBuffer+="-"
          start=i+1
        }
        case '+'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }
          arrayBuffer+="+"
          start=i+1
        }
        case '('=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }
          arrayBuffer+="("
          start=i+1
        }
        case ')'=>{
          val sub=s.substring(start,i)
          if(sub.nonEmpty){
            arrayBuffer+=sub
          }
          arrayBuffer+=")"
          start=i+1
        }
        case _ =>
      }
      }
    val sub=s.substring(start)
    if(sub.nonEmpty) {
      arrayBuffer += sub
    }
    arrayBuffer


  }


 def tokenize(arrayBuffer : ArrayBuffer[String]):ArrayBuffer[Any]={
  val array = new ArrayBuffer[Any]()

   for(x<-arrayBuffer){
   if(isNumeric(x)){
     array+=x.toDouble
   }else{
     x match {
       case "*" => array+=Operator('*',3)
       case ":" => array+=Operator('/',3)
       case "/" => array+=Operator('/',3)
       case "-" => array+=Operator('-',2)
       case "+" => array+=Operator('+',2)
       case "(" => array+=Operator('l',0)
       case ")" => array+=Operator('r',0)
       case _ => throw new IllegalArgumentException("Your input must consists of numbers and '+','-','/','*','(',')'")
     }
   }
 }
   return array
  }


  def compute(list: List[Any]):Double={
    var stack = list
    var operators = List[Operator]()
    var operands =  List[Double]()
    var pending_operand = false
    while(stack.nonEmpty){
      val x = stack.head
      stack=stack.tail
      if(x.isInstanceOf[Operator]){
       operators = x.asInstanceOf[Operator]::operators
        pending_operand=false
      }else {
        var operand=x.asInstanceOf[Double]
        if(pending_operand){
          while(operands.nonEmpty) {
            val operand_1 = operands.head
            operands=operands.tail
            val operator = operators.head
            operators=operators.tail
            operator.operator match {
              case '*' => operand = operand * operand_1
              case '/' => {
                if (!operand_1.equals(0.0)) {
                  operand = operand / operand_1
                } else {
                  throw new IllegalArgumentException("You cannot divide by zero!")
                }
              }
              case '-' => operand = operand - operand_1
              case '+' => operand = operand + operand_1
            }
          }
        }
        operands=operand::operands
        pending_operand=true
      }
    }
    return operands.head
  }

  def shaunting(arrayBuffer: ArrayBuffer[Any]):List[Any]={
    var output=List[Any]()
    var operators = List[Operator]()
    for(x<-arrayBuffer){
      if(x.isInstanceOf[Double]){
        output=x::output
      }else{
        val operator=x.asInstanceOf[Operator]
        if(!operator.pres.equals(0)) {
          while (operators.nonEmpty && (operators.head.pres > operator.pres || operators.head.pres == operator.pres)) {
            output = operators.head :: output
            operators = operators.tail
          }
          operators = operator :: operators
        }else if(operator.operator.equals('l')){
          operators=operator::operators
        }else if(operator.operator.equals('r')){
          Logger.debug(operators.toString())
          while(!operators.head.operator.equals('l')){
            output = operators.head :: output
            operators = operators.tail
            if(operators.isEmpty){
              throw new IllegalArgumentException("Parentheses are mismatched")
            }
          }
          operators=operators.tail

        }
      }
    }
    while(operators.nonEmpty){
      if(operators.head.operator.equals('l')){
        throw new IllegalArgumentException("Parentheses are mismatched")
      }
      output=operators.head::output
      operators=operators.tail
    }
    output
  }

  def isNumeric(str : String) = scala.util.Try(str.toDouble).isSuccess

}
case class Operator(operator:Char, pres:Int)


