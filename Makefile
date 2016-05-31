build:
	@docker build -t myjenkins .
restart:
	@docker stop jenkins-master
	@docker rm jenkins-master
	@docker run -p 49001:8080 --name=jenkins-master -d myjenkins
run:
	@docker run -p 49001:8080 --name=jenkins-master -d myjenkins
start:
	@docker start jenkins-master
stop:
	@docker stop jenkins-master
clean:	stop
	@docker rm -v jenkins-master
