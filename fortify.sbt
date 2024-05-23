// note the use of `ThisBuild` throughout to make these settings
// applicable to all subprojects, not just the root project

lazy val fortifyEnabled =
  settingKey[Boolean](
    "enable Fortify compiler plugin for Scala")

// enable plugin only if system property is "true"
ThisBuild / fortifyEnabled :=
  java.lang.Boolean.getBoolean("fortifyEnabled")

ThisBuild / libraryDependencies ++= (
  if (fortifyEnabled.value)
    Seq(
      compilerPlugin("com.lightbend" %% "scala-fortify" % "1.1.0"
        cross CrossVersion.patch))
  else
    Seq()
)

ThisBuild / scalacOptions ++= (
  if (fortifyEnabled.value)
    Seq("-P:fortify:scaversion=23.1", "-P:fortify:build=sample")
  else
    Seq()
)
