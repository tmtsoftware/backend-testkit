import sbt.Keys.{libraryDependencies, resolvers}

name := "backend-testkit"
libraryDependencies ++= Seq(ESW.`esw-testkit`)

inThisBuild(
  Seq(
    scalaVersion := "2.13.2",
    version := "0.1.0-SNAPSHOT",
    organization := "com.github.tmtsoftware.backend-testkit",
    organizationName := "ThoughtWorks",
    scalafmtOnCompile := true,
    resolvers ++= Seq(
      "jitpack" at "https://jitpack.io",
      Resolver.bintrayRepo("lonelyplanet", "maven")
    ),
    dependencyOverrides += AkkaHttp.`akka-http-spray-json`,
    fork := true,
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-Xlint:_,-missing-interpolator",
      "-Ywarn-dead-code"
    )
  )
)
