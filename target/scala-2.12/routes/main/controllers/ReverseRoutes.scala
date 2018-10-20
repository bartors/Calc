// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bartosz/IdeaProjects/Calc/conf/routes
// @DATE:Sat Oct 20 18:04:43 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseCalculatorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def result(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "result")
    }
  
    // @LINE:18
    def calculator(s:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calculator/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s", s)))
    }
  
    // @LINE:21
    def operation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "operation")
    }
  
    // @LINE:25
    def reset(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reset")
    }
  
    // @LINE:16
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calculator")
    }
  
    // @LINE:27
    def clear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clear")
    }
  
  }


}
