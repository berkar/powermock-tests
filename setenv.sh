#!/bin/bash

MAVEN_BUILD=3.2.2
export JDK=8

echo "========================================================================="
echo ""
echo "  Project Environment"
echo ""
echo "  MAVEN_BUILD: ${MAVEN_BUILD}"
echo ""
echo "  JDK: ${JDK}"
echo ""
echo "  PROJ_SHORTNAME: ${PROJ_SHORTNAME}"
echo ""
echo "========================================================================="
echo

sudo apt-get -y install oracle-java${JDK}-set-default
export JAVA_HOME="/usr/lib/jvm/java-${JDK}-oracle"
echo Setting JAVA_HOME to: ${JAVA_HOME}

sudo update-alternatives --set mvn /usr/share/maven/apache-maven-${MAVEN_BUILD}/bin/mvn;
echo "========================================================================="
echo "Found build environment:"
echo ""
mvn --version
echo "========================================================================="
echo
