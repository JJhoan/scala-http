import sbt._

object Dependencies {

  object Versions {
    val akka     = "2.8.0"
    val akkaHttp = "10.5.0"
  }

  val production: Seq[ ModuleID ] = Seq(
    "com.github.nscala-time" %% "nscala-time" % "2.32.0",
    "com.lihaoyi" %% "pprint" % "0.8.1",
    "com.typesafe.akka" %% "akka-http" % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-actor" % Versions.akka,
    "com.typesafe.akka" %% "akka-stream" % Versions.akka,
  )

  val test: Seq[ ModuleID ] = Seq(
    "org.scalatest" %% "scalatest" % "3.2.15" % Test,
    "com.typesafe.akka" %% "akka-testkit" % Versions.akka % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttp % Test,
  )
}
