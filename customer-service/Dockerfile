FROM adoptopenjdk/openjdk17:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/customer-service.jar"]