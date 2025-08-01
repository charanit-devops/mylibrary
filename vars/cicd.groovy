def gitdownload(repo)
{
   git "https://github.com/charanit-devops/${repo}.git"
}

def buildArtifact()
{
	sh 'mvn package'
}

def TomcatDeployment(jobname,ip,context)
{
	sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}

def runselenium(jobname)
{
   sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}
