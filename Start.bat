#!/bin/bash
call mvn clean
call mvn compile
call mvn test
call mvn package
cd target
java -jar GruppProject-1.0-SNAPSHOT.jar
