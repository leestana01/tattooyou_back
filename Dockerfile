FROM openjdk:11
#CMD ["./gradlew", "clean", "build"]
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} /app/
ENTRYPOINT ["java", "-jar", "/app/tattooyou-0.0.1-SNAPSHOT.jar"]