%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;../lib/mssql-jdbc.jar;../lib/sqlitejdbc-v056.jar;../lib/talend_DB_mssqlUtil-1.3-20190523.jar;garrison_gen_data_contact_0_1.jar; vincere_etl.garrison_gen_data_contact_0_1.garrison_gen_data_contact  --context=Default %*