FROM amazoncorretto:17-alpine3.17 as build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw && ./mvnw clean package

FROM amazoncorretto:17-alpine3.17
WORKDIR /app
COPY --from=build /app/target/api-service-*.jar api-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api-service.jar"]