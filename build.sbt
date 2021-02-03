import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "example"
ThisBuild / organizationName := "example"



lazy val root = (project in file("."))
  .settings(
    name := "Scala Boot",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-parent" % "2.3.3.RELEASE" pomOnly(),
  "org.springframework.boot" % "spring-boot-starter-data-mongodb-reactive" % "2.3.3.RELEASE",
  //"org.springframework.boot" % "spring-boot-starter-data-rest" % "2.3.3.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-webflux" % "2.3.3.RELEASE",
)
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
