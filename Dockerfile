FROM openjdk:11
EXPOSE 8080
ADD target/springboot-github-action-demo.jar springboot-github-action-demo.jar
ENTRYPOINT ["java","-jar","/springboot-github-action-demo.jar"]