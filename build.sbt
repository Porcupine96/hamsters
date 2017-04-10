import sbt.Keys._

name := "hamsters_test"
organization := "io.github.scala-hamsters"
version := "Fixed"
scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.11.8", "2.12.1")
scalacOptions in(Compile, doc) := Seq("-groups", "-implicits")
publishMavenStyle := true
libraryDependencies ++= Seq(
 "io.github.scala-hamsters" %% "hamsters" % "1.1.3-SNAPSHOT",
 "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
