FROM openjdk:8-apline

MAINTAINER yangwenbo bowenyxs@gmail.com

EXPOSE 9090

RUN mkdir /usr/local/web \
&& ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
&& echo Asia/Shanghai > /etc/timezone

WORKDIR /usr/local/web

#ENV JAR_FILE=target/web.jar
ARG JAR_FILE

ADD ${JAR_FILE} /usr/local/web/web.jar

CMD [ "java" ,  "-jar" , "web.jar" ]
