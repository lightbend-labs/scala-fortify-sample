lazy val fortifyEnabled =
  settingKey[Boolean](
    "enable Fortify compiler plugin for Scala")
// enable the plugin only if someone sets the key to "true"
fortifyEnabled := java.lang.Boolean.getBoolean("fortifyEnabled")

libraryDependencies ++= (
  if (fortifyEnabled.value)
    Seq(
      compilerPlugin("com.lightbend" %% "scala-fortify" % "1.0.25"
        cross CrossVersion.patch))
  else
    Seq()
)

scalacOptions ++= (
  if (fortifyEnabled.value)
    Seq("-P:fortify:scaversion=23.1", "-P:fortify:build=sample")
  else
    Seq()
)
