%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/jakarta-oro-2.0.8.jar;../lib/log4j-1.2.17.jar;transforming_a_list_of_files_as_data_flow_0_1.jar; vincere_etl.transforming_a_list_of_files_as_data_flow_0_1.Transforming_a_list_of_files_as_data_flow  %*