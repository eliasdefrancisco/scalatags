import org.scalajs.dom
import scala.scalajs.js.JSApp
import scalatags.JsDom.all._

/**
 * Created by elias on 6/28/16.
 */
object main extends JSApp{
  def main() ={
    println("Hello console")
    val paragraph = p()("This is my first paragraph").render

    dom.document.body.appendChild(
      div(
        h1("This is my title"),
        div(
          paragraph,
          a("href".attr:="http://www.google.com")(
            p("Goooogle")
          ),
          p("hidden".emptyAttr)(
            "I am hidden"
          )
        )
      ).render
    )

    paragraph.onclick = (e: dom.Event) =>{
      printHello()
      println(e)
    }
  }

  def printHello(): Unit = println("Hello")
}