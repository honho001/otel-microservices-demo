FROM amazoncorretto:17-alpine3.17 as build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw && ./mvnw clean package

FROM amazoncorretto:17-alpine3.17
WORKDIR /app
COPY --from=build /app/target/customer-service-*.jar customer-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","customer-service.jar"]