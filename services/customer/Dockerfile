FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/customer-0.0.1.jar
COPY ${JAR_FILE} app_customer.jar
ENTRYPOINT ["java","-jar","app_customer.jar"]