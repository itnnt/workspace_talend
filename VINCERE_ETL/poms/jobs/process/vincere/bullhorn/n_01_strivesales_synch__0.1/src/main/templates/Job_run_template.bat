%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;../lib/mysql-connector-java-8.0.12.jar;../lib/sqlitejdbc-v056.jar;n_01_strivesales_synch__0_1.jar; vincere_etl.n_01_strivesales_synch__0_1.N_01_strivesales_synch_  --context=Default %*