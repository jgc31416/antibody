name := "antibody"

version := "0.0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= {
  val sparkVer = "2.2.0"
  Seq(
    "org.apache.spark" %% "spark-graphx" % sparkVer % "provided" withSources(),
    "org.apache.spark" %% "spark-core" % sparkVer % "provided" withSources(),
    "org.apache.spark" %% "spark-sql" % sparkVer % "provided" withSources(),
    "org.apache.spark" %% "spark-streaming" % sparkVer % "provided" withSources()
  )
}

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "org.json4s" %% "json4s-native" % "3.3.0"
