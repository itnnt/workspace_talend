%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms1024M -Xmx2048M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;../lib/talend_file_enhanced_20070724.jar;jo_cook_ch05_0040_coderoutinecompleted_0_1.jar; vincere_etl.jo_cook_ch05_0040_coderoutinecompleted_0_1.jo_cook_ch05_0040_codeRoutineCompleted  %*