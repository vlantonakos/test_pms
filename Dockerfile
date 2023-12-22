FROM openjdk:17-oracle
ADD demo(5)/demo/target/*.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
