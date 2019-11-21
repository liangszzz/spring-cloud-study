FROM mcr.microsoft.com/java/jdk:13u1-zulu-alpine

#作者
MAINTAINER liang <s571286480@gmail.com>

#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

#声明一个挂载点，容器内此路径会对应宿主机的某个文件夹
VOLUME /tmp

ADD target/order-service-1.0-SNAPSHOT.jar order-service.jar

#启动容器时的进程
ENTRYPOINT ["java","-jar","/order-service.jar"]

#暴露8080端口
EXPOSE 9001

