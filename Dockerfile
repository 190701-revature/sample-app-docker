FROM openjdk:8-jdk
COPY SampleApp-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENV MY_ENV=dockerfile-variable
ENTRYPOINT ["java", "-jar", "/app.jar"]