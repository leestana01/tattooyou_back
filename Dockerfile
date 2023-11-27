FROM openjdk:11
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} /app/
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
