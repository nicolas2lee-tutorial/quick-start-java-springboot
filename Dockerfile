FROM 541463203001.dkr.ecr.us-east-1.amazonaws.com/amazoncorretto:11
COPY build/libs/java-springboot-quickstart-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
