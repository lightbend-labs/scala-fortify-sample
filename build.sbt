scalaVersion := "2.13.3"

name := "example"

addCompilerPlugin(
  "com.lightbend" % "scala-fortify" % "1.0.17"
    classifier "assembly"
    cross CrossVersion.patch)
scalacOptions += s"-P:fortify:build=example"
