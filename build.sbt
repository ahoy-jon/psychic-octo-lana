

name:= "Sbt+ScalaTest"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.8" % "test"

testOptions in Test += Tests.Argument("-l", "com.mycompany.tags.BadTest")

scalaSource in Test <<= baseDirectory(_ / "test")
