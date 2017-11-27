import sbt.Keys._

name := "hamsters_test"
organization := "io.github.scala-hamsters"
version := "Fixed"
scalaVersion := "2.12.3"
crossScalaVersions := Seq("2.11.11", "2.12.3")
addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full)
scalacOptions in(Compile, doc) := Seq("-groups", "-implicits")
publishMavenStyle := true
libraryDependencies ++= Seq(
 "org.scalameta" %% "scalameta" % "1.8.0",
 "io.github.scala-hamsters" %% "hamsters" % "2.1.2",
 "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
