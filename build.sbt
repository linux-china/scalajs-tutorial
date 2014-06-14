enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "1.0.0"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// Make jQuery available for `run` and `test` in sbt, *before* the Scala.js code
val jQueryScript =
  org.scalajs.jsenv.Input.Script(file("./jquery.js").toPath)
Compile / jsEnvInput := jQueryScript +: (Compile / jsEnvInput).value
Test / jsEnvInput := jQueryScript +: (Test / jsEnvInput).value

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
