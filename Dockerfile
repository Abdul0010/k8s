FROM openjdk:17-jdk
VOLUME /tmp
COPY /target/k8s-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]