# jenkinsdemo

Creates jenkins server on a docker container. Server will have git installed and can then be setup to connect to a repo on the github account.

Prereq:
 - generate sshkeys for jenkins server to connect to a github repo. Add the sshkey to github account and in the same directory as the Dockerfile. (https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)
 - must have docker installed.
 - must have a public facing IP for jenkins server to be hosted on

MakeFile
 - make build, builds the docker image "myjenkins"
 - make run, runs the docker image "myjenkins" on port 49001 as a container named "jenkins-master"
 - make start, starts the jenkins-master
 - make stop, stops the jenkins-master
 - make clean, stops and removes running jenkins-master
 - make restart, does a make clean then a make run

Steps to setup:
 1. Do a "make build" command.
 2. Do a "make run" command.
 3. Go onto port 49001 on where your docker is hosting the container.
 4. Add a new item(freestyle project). 
 5. Select Git in "Source Code Management."
 6. Add in your ssh url in your github repo.
 7. Add in a new credential "SSH Username with private key."
 8. Username is what you created in the sshkey prereq.
 9. Select "From the Jenkins master ~/.ssh" for private key and add yorur credential.
 10. Select "Build when a change is pushed to GitHub."
 11. Add a build step (test purposes select execute shell and type 'echo "hello world"').
 12. Save
 13. Go to your github repo settings and select "Webhooks and Services."
 14. Add service "Jenkins (GitHub plugin)."
 15. Push a change to your repo and Jenkins should automatically build.
