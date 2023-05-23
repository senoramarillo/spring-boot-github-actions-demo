FROM openjdk:17
EXPOSE 3000
ADD target/spring-boot-github-actions-demo.jar spring-boot-github-actions-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-github-actions-demo.jar"]