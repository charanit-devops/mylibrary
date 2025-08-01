def gitdownload(repo)
{
   git "https://github.com/charanit-devops/${repo}.git"
}

def buildArtifact()
{
	sh 'mvn package'
}
