FROM openjdk:11-jdk-stretch

ADD /target/ZuulAPIGateway-0.0.1-SNAPSHOT.jar /src/app/ZuulAPIGateway-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "ZuulAPIGateway-0.0.1-SNAPSHOT.jar"]