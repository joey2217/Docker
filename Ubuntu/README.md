# Ubuntu

### 常用命令



### NGINX

    NGINX安装
    $ sudo apt-get install nginx
    查看nginx进程是否启动
    $ ps -ef|grep nginx
    启动
    cd /etc/nginx
    sudo nginx

### SSH

    安装SSH
    sudo apt-get install openssh-server
    查看SSH是否启动 
    sudo ps -e |grep ssh
    修改配置
    sudo vim /etc/ssh/sshd_config
    去掉port 22的#

    ubuntu root用户默认不能ssh连接

### MYSQL

    安装mysql
    sudo apt-get install mysql-server
    cd /etc/mysql
    sudo vim/vi debian.cnf
    mysql -u debian-sys-maint -p
    修改root密码
     use mysql;
    update user set authentication_string=PASSWORD("这里输入你要改的密码") where User='root'; #更改密码
    update user set plugin="mysql_native_password"; #如果没这一行可能也会报一个错误，因此需要运行这一行
    flush privileges; #更新所有操作权限
    quit;
    远程连接
    >mysql -u root -p
    >use mysql;
    >grant all privileges  on *.* to root@'%' identified by "password";

### JDK安装

    下载jdk
    解压
    tar -zxvf jdk-8u131-linux-x64.tar.gz
    配置文件修改
    sudo gedit /etc/profile
    在文件的最后添加以下内容：
    #set Java environment

    export JAVA_HOME=/usr/local/java/jdk1.8.0_131(jdk pwd)
    export JRE_HOME=$JAVA_HOME/jre
    export CLASSPATH=.:$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH
    export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH
    source /etc/profile 