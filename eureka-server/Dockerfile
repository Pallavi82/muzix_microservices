FROM openjdk:11-jdk-stretch

ADD /target/EurekaClient-0.0.1-SNAPSHOT.jar /src/app/EurekaClient-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "EurekaClient-0.0.1-SNAPSHOT.jar"]