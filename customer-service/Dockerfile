FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/customer-service.jar"]