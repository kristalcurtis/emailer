name := "Emailer"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.4.1"
