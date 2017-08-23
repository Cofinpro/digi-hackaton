FROM airdock/oracle-jdk:1.8

ENTRYPOINT ["java", "-Djava.net.preferIPv4Stack=true", "-jar", "/usr/share/hackathon/registration-swarm.jar"]

EXPOSE 8080

ADD target/registration-swarm.jar /usr/share/hackathon/registration-swarm.jar

