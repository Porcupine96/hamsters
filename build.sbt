import sbt.Keys._

lazy val settings = Defaults.coreDefaultSettings ++ Seq(
  name := "hamsters_test",
  organization := "io.github.scala-hamsters",
  version := "Fixed",
  scalaVersion := "2.12.3",
  crossScalaVersions := Seq("2.11.11", "2.12.3"),
  addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full),
  scalacOptions in(Compile, doc) := Seq("-groups", "-implicits"),
  libraryDependencies ++= Seq(
 "org.scalameta" %% "scalameta" % "1.8.0",
 "io.github.scala-hamsters" %% "hamsters" % "2.3.0",
 "org.scalamock" %%% "scalamock-scalatest-support" % "3.6.0" % "test",
 "org.scalatest" %% "scalatest" % "3.0.1" % "test"
))

lazy val hamstersTest = crossProject.in(file("."))

lazy val hamstersTestJVM = hamstersTest.jvm.settings(settings)
lazy val hamstersTestJS = hamstersTest.js.settings(settings)

lazy val root = project.in(file("."))
  .aggregate(hamstersTestJVM, hamstersTestJS).settings(settings)
