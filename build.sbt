import sbtsonar.SonarPlugin.autoImport.sonarProperties

name := "SonarMan"
version := "0.1"
scalaVersion := "2.13.8"

name := "FileHandler"
version := "0.1"
scalaVersion := "2.13.8"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.12"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % "test"

sonarProperties ++= Map(
  "sonar.modules" -> "module1,module2",
  "module1.sonar.projectName" -> "Module 1",
  "module2.sonar.projectName" -> "Module 2"
)

sonarProperties := Map(
  "sonar.host.url" -> "http://172.31.41.72/:9000",
  "sonar.projectName" -> "SonarMan",
  "sonar.projectKey" -> "263a1dcc3fbee8e6e7a7dcda14dca6c6ef1c3351",
  "sonar.sources" -> "src/main/scala",
  "sonar.tests" -> "src/test/scala",
  "sonar.junit.reportPaths" -> "target/test-reports",
  "sonar.sourceEncoding" -> "UTF-8",
  "sonar.scala.scoverage.reportPath" -> "target/scala-2.13/scoverage-report/scoverage.xml",
  "sonar.scala.scapegoat.reportPath" -> "target/scala-2.13/scapegoat-report/scapegoat.xml"
)

//Command to execute sonarscan
//sbt -Dsonar.host.url=http://192.168.0.128:9000 -Dsonar.login=263a1dcc3fbee8e6e7a7dcda14dca6c6ef1c3351 sonarScan
//"sonar.coverage.jacoco.xmlReportPaths" "target/scala-2.13/reports/jacoco.xml"c
