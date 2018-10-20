package controllers

import javax.inject._

import play.api.mvc._
import services.Calc


class CalculatorController @Inject()(cc: ControllerComponents, calc : Calc) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.calc("Calculator bitch"))
  }
  def calculator(s:String)= Action{
    Ok(calc.run(s).toString)
  }
  def operation()=Action{
    Ok(calc.getOperation())
  }
  def result()=Action{
    Ok(calc.getResult())
  }
  def reset()=Action{
    Ok(calc.reset())
  }
  def clear()=Action{
    Ok(calc.clearMemory())
  }

}
