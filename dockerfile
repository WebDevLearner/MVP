FROM openjdk:8-jdk-alpine
COPY target/MVP-0.0.1-SNAPSHOT.jar MVP.jar
ENTRYPOINT ["java","-jar","MVP.jar"]