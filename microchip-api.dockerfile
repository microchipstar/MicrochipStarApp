FROM openjdk:11-jdk-slim
COPY target/MicrochipsStarApp-API-service-0.0.1-SNAPSHOT.jar microchip-api.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","/microchip-api.jar"]