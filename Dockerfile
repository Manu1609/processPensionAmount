FROM openjdk:17-jdk-slim-buster AS builder
EXPOSE 8090
ADD target/processPensionAmount.jar processPensionAmount.jar
ENTRYPOINT ["java","-jar","processPensionAmount.jar"]