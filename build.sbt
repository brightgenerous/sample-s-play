import com.github.play2war.plugin._

name := """sample-s-play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "jquery" % "1.11.1",
  "org.mockito" % "mockito-all" % "1.10.8" % "test",
  "com.googlecode.jmockit" % "jmockit" % "1.7" % "test",
  "org.webjars" % "mocha" % "2.0.1" % "test",
  "org.webjars" % "chai" % "1.9.1" % "test",
  "org.webjars" % "sinonjs" % "1.7.3" % "test"
)

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.1"

webModuleDirectory in TestAssets := webTarget.value / "node-modules" / "test"

scalariformSettings
