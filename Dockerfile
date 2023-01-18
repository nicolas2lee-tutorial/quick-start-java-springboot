FROM public.ecr.aws/amazoncorretto/amazoncorretto:11
COPY build/libs/java-springboot-quickstart-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
