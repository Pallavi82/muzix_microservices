FROM openjdk:11-jdk-stretch

ADD /target/MusicService-0.0.1-SNAPSHOT.jar /src/app/MusicService-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "MusicService-0.0.1-SNAPSHOT.jar"]