# Docker
### Dockerfile

    touch Dockerfile
    编辑Dockerfile
    FROM ubuntu
    MAINTAINER Joey
    RUN sed -i 's/archive.ubuntu.com/mirrors.ustc.edu.cn/g' /etc/apt/sources.list
    RUN apt-get update
    RUN apt-get install -y nginx


### Dockerfile语法

    FROM:base image
    RUN:执行命令
    ADD:添加文件
    COPY:拷贝文件
    CMD:执行命令
    EXPOSE:暴露端口
    WORKDIR:指定路径
    MAINTINER:维护者
    ENV:设定环境变量
    ENERYPOINT:容器入口
    USER:指定用户
    VOLUME:mount point