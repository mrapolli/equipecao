FROM frolvlad/alpine-oraclejdk8:slim
ADD /boot-drools-1.0.0-SNAPSHOT.jar //
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /boot-drools-1.0.0-SNAPSHOT.jar"]
