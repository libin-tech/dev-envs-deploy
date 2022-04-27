FROM libin/alpine-jre8

MAINTAINER im_libin

RUN mkdir -p /docker/monitor
RUN mkdir -p /docker/monitor/logs

WORKDIR /docker/monitor

EXPOSE 9090

ADD ./target/extend-spring-boot-monitor-admin.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
