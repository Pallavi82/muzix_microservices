FROM openjdk:11-jdk-stretch

ADD /target/SpringConfigServer-0.0.1-SNAPSHOT.jar /src/app/SpringConfigServer-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "SpringConfigServer-0.0.1-SNAPSHOT.jar"]