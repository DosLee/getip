FROM openjdk:8-jdk
VOLUME /tmp
ADD lib/*.jar app.jar
ENV TZ=Asia/Shanghai
ENTRYPOINT ["java", "-Djava.secure.egd=file:/dev/./urandom","-jar", "app.jar"]
