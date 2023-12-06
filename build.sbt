ThisBuild / scalaVersion := "3.3.1"
lazy val root = project.in(file("."))
  .aggregate(subproject1, subproject2)
lazy val subproject1 = project.in(file("subproject1"))
lazy val subproject2 = project.in(file("subproject2"))
