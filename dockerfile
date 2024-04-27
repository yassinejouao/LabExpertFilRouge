FROM openjdk:17-oracle
WORKDIR /app
COPY target/labx-0.0.1-SNAPSHOT.jar /app/labx-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "labx-0.0.1-SNAPSHOT.jar"]