#Pull base jenkins image

FROM jenkins
ADD plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt
RUN echo 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state

MAINTAINER Brian Wan

USER root

#add log file
RUN mkdir /var/log/jenkins

#add ssh keys
RUN mkdir -p /root/.ssh
ADD id_rsa /root/.ssh/id_rsa
RUN chmod 700 /root/.ssh/id_rsa
RUN echo "Host github.com\n\tStrictHostKeyChecking no\n" >> /root/.ssh/config

RUN chown -R  jenkins:jenkins /var/log/jenkins
#USER jenkins

#8GB memory
ENV JAVA_OPTS="-Xmx8192m"
#give handlers and cap (for traffic to jenkins server), also create log file.
ENV JENKINS_OPTS="--handlerCountStartup=100 --handlerCountMax=300 --logfile=/var/log/jenkins/jenkins.log"
ENV GITHUB_USERNAME="briankwan@us.ibm.com"