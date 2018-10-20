// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bartosz/IdeaProjects/Calc/conf/routes
// @DATE:Sat Oct 20 11:12:22 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
