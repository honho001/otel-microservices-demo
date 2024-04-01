FROM amazoncorretto:17-alpine3.17 as build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw && ./mvnw clean package

FROM amazoncorretto:17-alpine3.17
WORKDIR /app
COPY --from=build /app/target/address-service-*.jar address-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","address-service.jar"]