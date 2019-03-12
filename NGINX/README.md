# NGINX
### ubuntu nginx

    sudo apt-get install nginx
    安装好的文件位置：
    /usr/sbin/nginx：主程序
    /etc/nginx：存放配置文件
    /usr/share/nginx：存放静态文件 /var/www/html
    /var/log/nginx：存放日志
    其实从上面的根目录文件夹可以知道，Linux系统的配置文件一般放在/etc，日志一般放在/var/log，运行的程序一般放在/usr/sbin或者/usr/bin。

    当然，如果要更清楚Nginx的配置项放在什么地方，可以打开/etc/nginx/nginx.conf


     docker container run \
      --rm \
      --name mynginx \
      --volume "$PWD/html":/usr/share/nginx/html \
      --volume "$PWD/conf":/etc/nginx \
      -p 8080:80 \
      -d \
      nginx

