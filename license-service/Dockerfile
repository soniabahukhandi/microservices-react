#Start with a base image containing Java runtime
FROM eclipse-temurin:21.0.1_12-jre-jammy as build
WORKDIR spring
ARG JAR_FILE=target/*.jar
#Start with a base image containing Java runtime
COPY ${JAR_FILE} app.jar

#extract the jar file
RUN java -Djarmode=layertools -jar app.jar extract

#stage 2 
FROM eclipse-temurin:21.0.1_12-jre-jammy

WORKDIR spring

#Copy unpackaged application to new container 

COPY --from=build spring/dependencies/ ./ 
COPY --from=build spring/spring-boot-loader/ ./
COPY --from=build spring/snapshot-dependencies/ ./
COPY --from=build spring/application/ ./ 

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]