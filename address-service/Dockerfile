FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} address-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/address-service.jar"]