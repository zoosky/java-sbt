lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.2.0")

