#!/bin/bash

tag="$1"

if [ -z "$tag" ]
  then
    tag="latest"
    echo "No tag supplied. latest is default"
fi

echo "$(tput setaf 4) maven clean package"
mvn clean package -o -Dmaven.test.skip=true
echo "$(tput setaf 4) Build the docker image. Tag =  $tag"
docker build -t georgia-backend:$tag  -f .
echo "$(tput setaf 4) maven clean"
mvn clean
echo "$(tput setaf 4) Image build completed"