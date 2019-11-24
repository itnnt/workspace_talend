#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/crypto-utils.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.17.jar:$ROOT_PATH/../lib/sqlitejdbc-v056.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/n_02_strivesales_standard_files__0_1.jar: vincere_etl.n_02_strivesales_standard_files__0_1.N_02_strivesales_standard_files_  "$@"