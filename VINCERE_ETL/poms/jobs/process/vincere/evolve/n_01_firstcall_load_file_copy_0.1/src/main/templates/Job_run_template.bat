%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/jakarta-oro-2.0.8.jar;../lib/jsch-0.1.55.jar;../lib/log4j-1.2.17.jar;n_01_firstcall_load_file_copy_0_1.jar; vincere_etl.n_01_firstcall_load_file_copy_0_1.N_01_firstcall_load_file_Copy  %*