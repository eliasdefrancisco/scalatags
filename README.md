# scalatags over scalajs helloword
This example try to complete the scalatags official documentation with a very simple example which you can use on your computer localy and follow the official examples easily.
I found lost myself when I tried to follow the official examples, I didn't find any clearly documentation about how I could run a simple Helloword from scratch, and this is why I'm publishing this now.

## What do you need to run this project on your machine?
Only sbt 

## Where is the code?
- Here is the scala code (scalajs whith scalatags):
scalatags/src/main/scala/main.scala
- Here is the HTML file which link the javascript generated by scalajs:
scalatags/target/scala-2.11/scalatags.html

## Ok, I want to modify it!
- First clone this repository
- Modify what you want
- Run sbt inside your local repository
- Run fastOptJS inside sbt console 
(this generates the javascript files from your scala code in scalatags/target/scala-2.11/)
- Open scalatags/target/scala-2.11/scalatags.html 

## What files do you need for production?
Only the two .js and one .html from scalatags/target/scala-2.11/

## I love this and I want more!
- Official documentation for scalajs:
https://www.scala-js.org/tutorial/
- Official documentation for the lovely scalatags:
http://www.lihaoyi.com/scalatags/#ScalaTags

# I hope this comes in handy!
