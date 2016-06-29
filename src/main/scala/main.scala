/**
 * Created by eliasdefrancisco@gmail.com on 6/28/16.
 *
 * Illustrating basics for scalatags over scalajs
 *
 */

import org.scalajs.dom
import scala.scalajs.js.JSApp
import scalatags.JsDom.all._
import org.scalajs.jquery.jQuery

object main extends JSApp{

  // Append HTML code directly to the DOM
  def main(): Unit = {
    printHello("main")
    dom.document.body.appendChild(htmlReturn)
    mainJquery()
  }

  // Append HTML code to the DOM using JQuery
  def mainJquery(): Unit = {
    printHello("mainJquery")
    val body = jQuery("body")
    body.append("""</br><p>--- The same thing but using JQuery for append HTML code to the body ---</p>""")
    body.append(htmlReturn)
  }

  // Return the HTML code which will be appended to the DOM (scalatags)
  def htmlReturn: dom.Node = {

    // Creating an isolated paragraph and setting onclick event
    val paragraph = p(id:="paragraph1")("This is a paragraph (click and watch the console)").render
    paragraph.onclick = (e: dom.Event) => printHello("paragraph " + e + " " + e.timeStamp)

    // Returning to HTML code.
    // THIS IS THE MOST IMPORTANT THING YOU HAVE TO BEAR IN MIND TO REALIZE HOW POWERFUL SCALATAGS ARE.
    // NO MAGIC, NO SPAGHETTI, EVERYTHING IS A FUNCTION, YOU ARE ALWAYS WORKING WITH SCALA CORE
    div(
      h1("A nice title"),
      div(
        paragraph,
        a("href".attr:="http://www.google.com")(p("Goooogle")),
        p("hidden".emptyAttr)("Where is Jessica Hyde?")
      )
    ).render
  }

  // Print hello message on js console
  def printHello(mes: String): Unit =
    println("Hello console from " + mes)
}

