name := "MyJavaProject"

version := "1.0"

scalaVersion := "2.13.14" // This is required but won't affect your Java code

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// Specify the main class for the application
Compile / mainClass := Some("com.example.App")

// Ensure the project compiles Java sources
compileOrder := CompileOrder.JavaThenScala

// specify jar name
assembly / assemblyJarName := "hello.jar"

// library dependencies. (organization name) % (project name) % (version)
libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4"
)
