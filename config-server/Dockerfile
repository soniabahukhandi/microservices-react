FROM eclipse-temurin:21.0.1_12-jre-jammy
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
EXPOSE 8071
ENTRYPOINT ["java", "-jar","application.jar"]
