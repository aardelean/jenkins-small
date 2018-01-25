#!/bin/sh

exec java ${JAVA_OPTS} -server -Xms384m -Xmx384m -XX:MaxMetaspaceSize=64m -jar /opt/jenkins-small.jar
