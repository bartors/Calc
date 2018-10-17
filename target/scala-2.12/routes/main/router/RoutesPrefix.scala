// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bartosz/IdeaProjects/Calc/conf/routes
// @DATE:Wed Oct 17 19:49:13 CEST 2018


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
