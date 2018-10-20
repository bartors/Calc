// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bartosz/IdeaProjects/Calc/conf/routes
// @DATE:Sat Oct 20 18:04:43 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:16
  CalculatorController_0: controllers.CalculatorController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:16
    CalculatorController_0: controllers.CalculatorController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_4, CalculatorController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_4, CalculatorController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calculator""", """controllers.CalculatorController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calculator/""" + "$" + """s<[^/]+>""", """controllers.CalculatorController.calculator(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """operation""", """controllers.CalculatorController.operation()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """result""", """controllers.CalculatorController.result()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset""", """controllers.CalculatorController.reset()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clear""", """controllers.CalculatorController.clear()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CalculatorController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calculator")))
  )
  private[this] lazy val controllers_CalculatorController_index4_invoker = createInvoker(
    CalculatorController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "index",
      Nil,
      "GET",
      this.prefix + """calculator""",
      """ The calculator for Ardoq""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CalculatorController_calculator5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calculator/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalculatorController_calculator5_invoker = createInvoker(
    CalculatorController_0.calculator(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "calculator",
      Seq(classOf[String]),
      "GET",
      this.prefix + """calculator/""" + "$" + """s<[^/]+>""",
      """ Get input for the calculator""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CalculatorController_operation6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("operation")))
  )
  private[this] lazy val controllers_CalculatorController_operation6_invoker = createInvoker(
    CalculatorController_0.operation(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "operation",
      Nil,
      "GET",
      this.prefix + """operation""",
      """ Get operations history from calculator""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CalculatorController_result7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("result")))
  )
  private[this] lazy val controllers_CalculatorController_result7_invoker = createInvoker(
    CalculatorController_0.result(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "result",
      Nil,
      "GET",
      this.prefix + """result""",
      """ Get operations history from calculator""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CalculatorController_reset8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset")))
  )
  private[this] lazy val controllers_CalculatorController_reset8_invoker = createInvoker(
    CalculatorController_0.reset(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "reset",
      Nil,
      "GET",
      this.prefix + """reset""",
      """ Get operations history from calculator""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CalculatorController_clear9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clear")))
  )
  private[this] lazy val controllers_CalculatorController_clear9_invoker = createInvoker(
    CalculatorController_0.clear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "clear",
      Nil,
      "GET",
      this.prefix + """clear""",
      """ Clear memory in calc""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(file))
      }
  
    // @LINE:16
    case controllers_CalculatorController_index4_route(params@_) =>
      call { 
        controllers_CalculatorController_index4_invoker.call(CalculatorController_0.index)
      }
  
    // @LINE:18
    case controllers_CalculatorController_calculator5_route(params@_) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_CalculatorController_calculator5_invoker.call(CalculatorController_0.calculator(s))
      }
  
    // @LINE:21
    case controllers_CalculatorController_operation6_route(params@_) =>
      call { 
        controllers_CalculatorController_operation6_invoker.call(CalculatorController_0.operation())
      }
  
    // @LINE:23
    case controllers_CalculatorController_result7_route(params@_) =>
      call { 
        controllers_CalculatorController_result7_invoker.call(CalculatorController_0.result())
      }
  
    // @LINE:25
    case controllers_CalculatorController_reset8_route(params@_) =>
      call { 
        controllers_CalculatorController_reset8_invoker.call(CalculatorController_0.reset())
      }
  
    // @LINE:27
    case controllers_CalculatorController_clear9_route(params@_) =>
      call { 
        controllers_CalculatorController_clear9_invoker.call(CalculatorController_0.clear())
      }
  }
}
