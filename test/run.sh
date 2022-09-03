#!/bin/sh
cd $(dirname $0)

cd ..
./gradlew clean
./gradlew compileJava
./gradlew jar
./gradlew bootJar

echo "About to run SimpleRestController" 
sleep 2

./gradlew bootRun &



echo "Shutting down"
sleep 5

pkill -f gradlew

echo "Should be down now"
