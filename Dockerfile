FROM openjdk:8

ADD /target/docker-spring.jar docker-spring.jar
ENTRYPOINT ["java", "-jar", "docker-spring.jar"]

EXPOSE 8761