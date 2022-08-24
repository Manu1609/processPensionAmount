FROM public.ecr.aws/docker/library/openjdk:latest
EXPOSE 8090
ADD target/processPensionAmount.jar processPensionAmount.jar
ENTRYPOINT ["java","-jar","processPensionAmount.jar"]
