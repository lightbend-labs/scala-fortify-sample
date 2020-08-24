scalaVersion := "2.13.3"

name := "example"

// enable the plugin
/* addCompilerPlugin(
  "com.lightbend" %% "scala-fortify" % "1.0.17"
    classifier "assembly" cross CrossVersion.patch)
*/

// configure the plugin
/* scalacOptions ++= Seq(
  "-P:fortify:scaversion=20.1",
  "-P:fortify:build=example"
)
*/

