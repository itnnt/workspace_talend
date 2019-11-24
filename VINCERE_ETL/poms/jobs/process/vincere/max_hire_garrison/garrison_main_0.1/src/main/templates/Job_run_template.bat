%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;garrison_main_0_1.jar;garrison_gen_data_attachment_0_1.jar;garrison_gen_data_company_0_1.jar; vincere_etl.garrison_main_0_1.garrison_main  %*