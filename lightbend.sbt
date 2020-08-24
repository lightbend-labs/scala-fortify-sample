
// this makes it so sbt can resolve the plugin
credentials += Credentials(
  Path.userHome / ".lightbend" / "commercial.credentials")
resolvers += "lightbend-commercial-releases" at
  "https://repo.lightbend.com/commercial-releases/"

// enable the plugin
addCompilerPlugin(
  "com.lightbend" %% "scala-fortify" % "1.0.17"
    classifier "assembly" cross CrossVersion.patch)

/* configure the plugin
scalacOptions ++= 
  Seq(
  "-P:fortify:scaversion=20.1",
  "-P:fortify:build=example"
)
*/

//lazy val fortifyEnabled := settingKey[Boolean]("enable Fortify SCA for Scala compiler plugin")
// fortifyEnabled := false

lazy val fortifyEnabled := settingKey[Boolean]("enable things")
/*
libraryDependencies ++= if (fortifyEnabled.value)
  Seq(compilerPlugin("com.lightbend" %% "scala-fortify" % "1.0.17")) else Seq()
scalacOptions ++= if (fortifyEnabled.value)
  Seq("-P:fortify:scaversion=20.1", "-P:fortify:build=example") else Seq()
*/
