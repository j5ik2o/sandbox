name := "dc"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

scalacOptions += "-P:continuations:enable"

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.7.1" % "test"
)

initialCommands := "import com.example.example._"