FROM openjdk:11-jdk-stretch

ADD /target/testdemo-0.0.1-SNAPSHOT.jar /src/app/testdemo-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "testdemo-0.0.1-SNAPSHOT.jar"]