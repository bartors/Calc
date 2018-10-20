
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object calc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Calculator</title>
        <script type="text/javascript" src='"""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("javascripts/calc.js")),format.raw/*6.92*/("""'></script>

    </head>
<body>
<h1>"""),_display_(/*10.6*/message),format.raw/*10.13*/("""</h1>
<form action ="/calculator/">
    Write your calculation in here:<br>
    <input  id="calc" type=" text" name="calc"><br>
    <input type="button" onclick="calculate('calc' )" value="Calculate">

</form>
</body>
</html>"""))
      }
    }
  }

  def render(message:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(message)(assetsFinder)

  def f:((String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (message) => (assetsFinder) => apply(message)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 20 11:45:35 CEST 2018
                  SOURCE: /home/bartosz/IdeaProjects/Calc/app/views/calc.scala.html
                  HASH: fe837ae8d25e7b51935780a2c806b06b7203a61b
                  MATRIX: 741->1|888->55|915->56|1038->153|1052->159|1112->199|1175->236|1203->243
                  LINES: 21->1|26->2|27->3|30->6|30->6|30->6|34->10|34->10
                  -- GENERATED --
              */
          