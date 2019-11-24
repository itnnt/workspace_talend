%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/activation.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;../lib/mail-1.4.jar;../lib/mysql-connector-java-8.0.12.jar;sub_job_0_1.jar; vincere_etl.sub_job_0_1.sub_job  %*