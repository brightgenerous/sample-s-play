import com.github.play2war.plugin._

name := """sample-s-play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.1"

scalariformSettings
