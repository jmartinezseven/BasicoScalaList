lazy val _scalacOptions = Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ypartial-unification",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Xfuture"
)

lazy val _resolvers = Seq(
  Resolver.bintrayRepo("outworkers", "oss-releases"),
  Resolver.bintrayRepo("findify", "maven"),
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("snapshots"),
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  DefaultMavenRepository
)

lazy val _libraryDependencies = {
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )
}

lazy val _commonSettings = Seq(
  organization := "BasicoListas",
  scalaVersion := "2.12.4",
  scalacOptions ++= _scalacOptions,
  resolvers ++= _resolvers,
  libraryDependencies ++= _libraryDependencies,
)


lazy val `BasicoListas` = (project in file(".")).settings(_commonSettings)