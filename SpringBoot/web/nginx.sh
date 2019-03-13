#!/bin/bash
  docker container run \
  --rm \
  --name mynginx \
  --volume "$PWD/html":/usr/share/nginx/html \
  --volume "$PWD/conf":/etc/nginx \
  -p 8080:80 \
  -d \
  nginx:stable-alpine
