FROM eclipse-temurin:17-jre
WORKDIR /app
# Add the dot slash to be explicit about the current directory
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]