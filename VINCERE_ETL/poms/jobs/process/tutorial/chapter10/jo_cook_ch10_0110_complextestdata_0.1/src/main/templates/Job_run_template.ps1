$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Dtalend.component.manager.m2.repository=%cd%/../lib' '-Xms512M' '-Xmx2048M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/crypto-utils.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.17.jar;../lib/talendExternalJar.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;jo_cook_ch10_0110_complextestdata_0_1.jar;' vincere_etl.jo_cook_ch10_0110_complextestdata_0_1.jo_cook_ch10_0110_complexTestData  %*