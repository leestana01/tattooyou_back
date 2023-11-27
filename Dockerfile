FROM openjdk:11
ARG JAR_FILE_PATH=/workspace/TattooYou/build/libs/*.jar
COPY ${JAR_FILE_PATH} /app/
ENTRYPOINT ["java", "-jar", "/app/tattooyou-0.0.1-SNAPSHOT.jar"]
