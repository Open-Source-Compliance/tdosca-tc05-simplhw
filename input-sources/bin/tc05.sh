#!/bin/bash

#JAR=`ls ../lib/tc05*.jar`

PWD=`pwd`
SWD=`dirname $0`
LWD="$PWD/$SWD/../lib/"
export CLASSPATH=$LWD:$CLASSPATH
JAR=`ls $LWD/tc05*.jar`

java -jar $JAR