enablePlugins(ScalaJSPlugin)

name := "scalatags"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.5.5"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"