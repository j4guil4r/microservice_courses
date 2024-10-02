FROM openjdk:22-jdk-alpine

WORKDIR /app

COPY target/microservice_courses-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
