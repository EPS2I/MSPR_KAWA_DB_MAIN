#!/bin/bash

#docker rm -f mspr-kawa-db || true  &
docker rm -f postgresql || true &
wait

#docker rmi -f mspr-kawa-db || true &
docker rmi -f postgresql || true &
wait

#docker build -t mspr-kawa-db . &
docker build -t postgresql ./db_main &
wait

echo ""
echo ""
echo "Image mspr-kawa-db - postgresql              | OK |"
echo ""
echo ""

#docker run --name mspr-kawa-db -d -p 8077:8077 -e SPRING_PROFILES_ACTIVE=prod mspr-kawa-db
#docker run --name mspr-kawa-db -d -p 8077:8077 mspr-kawa-db &
docker run --name postgresql -d -p 5432:5432 postgresql &
wait


echo ""
echo ""
echo "Container mspr-kawa-db - postgresql              | OK |"
echo ""
echo ""
