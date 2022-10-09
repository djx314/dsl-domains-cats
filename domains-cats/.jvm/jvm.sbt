enablePlugins(Example)

import Ordering.Implicits._

libraryDependencies += "org.typelevel" %%% "cats-effect" % "3.3.14" % Optional

Test / sourceGenerators := {
  (Test / sourceGenerators).value.filterNot { sourceGenerator =>
    VersionNumber(scalaVersion.value).numbers >= Seq(2L, 13L) &&
    sourceGenerator.info
      .get(taskDefinitionKey)
      .exists { scopedKey: ScopedKey[_] =>
        scopedKey.key == generateExample.key
      }
  }
}
