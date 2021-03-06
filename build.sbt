name := """play-strap"""

version := "0.0.1"

scalaVersion in ThisBuild := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  ws,
  filters,
  "com.h2database" % "h2" % "1.4.193",
  "mysql" % "mysql-connector-java" % "5.1.40",
  "org.postgresql" % "postgresql" % "9.4.1208",
  //    "com.github.mumoshu" %% "play2-memcached-play24" % "0.7.0",

  "com.typesafe.play" %% "play-slick" % "2.0.2",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.2",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.2.0",

  "jp.t2v" %% "play2-auth" % "0.14.2",
  "jp.t2v" %% "play2-auth-test" % "0.14.2" % "test",

  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

CoffeeScriptKeys.sourceMap := false

LessKeys.compress in Assets := true

includeFilter in(Assets, LessKeys.less) := "*.less"

includeFilter in gzip := "*.js"

pipelineStages := Seq(gzip)

lazy val root = (project in file(".")).enablePlugins(PlayScala)