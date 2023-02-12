FROM amazoncorretto:11 as builder
COPY . /app
WORKDIR /app

RUN ./gradlew clean build

FROM amazoncorretto:11
COPY  --from=builder /app/build/libs/java-springboot-quickstart-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]