#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/crypto-utils.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.17.jar:$ROOT_PATH/garrison_main_0_1.jar:$ROOT_PATH/garrison_gen_data_attachment_0_1.jar:$ROOT_PATH/garrison_gen_data_company_0_1.jar: vincere_etl.garrison_main_0_1.garrison_main  "$@"