libraryDependencies += "org.typelevel" %%% "cats-free" % "2.8.0" % Test

libraryDependencies += "org.typelevel" %%% "cats-free" % "2.8.0" % Optional // For Scaladoc

libraryDependencies += "org.typelevel" %%% "cats-core" % "2.8.0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.13" % Test

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-catch" % "2.0.0-M1"

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-monadic" % "2.0.0-M1"

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-return" % "2.0.0-M1"

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-shift" % "2.0.0-M1" % Optional

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-yield" % "2.0.0-M1" % Optional

addCompilerPlugin(
  "com.thoughtworks.dsl" %% "compilerplugins-bangnotation" % "2.0.0-M1"
)

addCompilerPlugin(
  "com.thoughtworks.dsl" %% "compilerplugins-reseteverywhere" % "2.0.0-M1"
)

scalacOptions ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers < Seq(2L, 12L)) {
    // Enable SAM types for Scala 2.11
    Some("-Xexperimental")
  } else {
    None
  }
}
