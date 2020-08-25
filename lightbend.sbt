credentials += Credentials(
  Path.userHome / ".lightbend" / "commercial.credentials")
resolvers += "lightbend-commercial-releases" at
  "https://repo.lightbend.com/commercial-releases/"

lazy val fortifyEnabled = settingKey[Boolean]("enable Fortify SCA for Scala compiler plugin")
// enable the plugin only if someone sets the key to true
fortifyEnabled := System.getProperty("fortifyEnabled") == "true"

libraryDependencies ++= (
    if (fortifyEnabled.value)
      Seq(compilerPlugin("com.lightbend" %% "scala-fortify" % "1.0.17" classifier "assembly" cross CrossVersion.patch))
   else Seq())

scalacOptions ++= (
  if (fortifyEnabled.value)
    Seq("-P:fortify:scaversion=20.1", "-P:fortify:build=example")
  else Seq())
