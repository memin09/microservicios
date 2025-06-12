FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/discovery-0.0.1.jar
COPY ${JAR_FILE} app_discovery.jar
ENTRYPOINT ["java","-jar","app_discovery.jar"]