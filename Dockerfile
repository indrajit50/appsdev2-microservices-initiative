FROM openjdk:8-jre-alpine
ADD target/appsdev2-microservices-initiative.jar appsdev2-microservices-initiative.jar
EXPOSE 9001
CMD exec java -jar appsdev2-microservices-initiative.jar