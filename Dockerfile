FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/challenge-backend-0.0.1-SNAPSHOT.jar challenge-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "challenge-backend-0.0.1-SNAPSHOT.jar"]