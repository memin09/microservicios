FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/demo-0.0.1.jar
COPY ${JAR_FILE} app_config_server.jar
ENTRYPOINT ["java" ,"-jar","app_config_server.jar"]