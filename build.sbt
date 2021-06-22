name := """test2-backend"""
organization := "gov.hmrc"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

resolvers += "HMRC-open-artefacts-maven2" at "https://open.artefacts.tax.service.gov.uk/maven2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "uk.gov.hmrc.mongo" %% "hmrc-mongo-play-28" % "0.49.0"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.0-RC2"
libraryDependencies += "com.github.tomakehurst" % "wiremock-jre8" % "2.27.1"
libraryDependencies += "org.scalatestplus" %% "mockito-3-4" % "3.2.5.0"
libraryDependencies += "org.scalatest"     %% "scalatest-wordspec" % "3.2.9" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "gov.hmrc.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "gov.hmrc.binders._"
