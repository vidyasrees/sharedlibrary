def gitdownload(repo)
{
  git "https://github.com/vidyasrees/${repo}.git"
}
def build()
{
  sh "mvn package"
}

