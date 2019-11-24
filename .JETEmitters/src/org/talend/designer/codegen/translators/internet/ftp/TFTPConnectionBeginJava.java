package org.talend.designer.codegen.translators.internet.ftp;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.utils.NodeUtil;

public class TFTPConnectionBeginJava
{
  protected static String nl;
  public static synchronized TFTPConnectionBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TFTPConnectionBeginJava result = new TFTPConnectionBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t\t\t\tlog.debug(\"";
  protected final String TEXT_2 = " - Retrieving records from the datasource.\");" + NL + "\t\t\t";
  protected final String TEXT_3 = NL + "\t\t\t\tlog.debug(\"";
  protected final String TEXT_4 = " - Retrieved records count: \"+ nb_line_";
  protected final String TEXT_5 = " + \" .\");" + NL + "\t\t\t";
  protected final String TEXT_6 = " - Retrieved records count: \"+ globalMap.get(\"";
  protected final String TEXT_7 = "_NB_LINE\") + \" .\");" + NL + "\t\t\t";
  protected final String TEXT_8 = " - Written records count: \" + nb_line_";
  protected final String TEXT_9 = NL + "\t\t\t\tfinal StringBuffer log4jSb_";
  protected final String TEXT_10 = " = new StringBuffer();" + NL + "\t\t\t";
  protected final String TEXT_11 = " - Retrieving the record \" + (nb_line_";
  protected final String TEXT_12 = ") + \".\");" + NL + "\t\t\t";
  protected final String TEXT_13 = " - Writing the record \" + nb_line_";
  protected final String TEXT_14 = " + \" to the file.\");" + NL + "\t\t\t";
  protected final String TEXT_15 = " - Processing the record \" + nb_line_";
  protected final String TEXT_16 = " + \".\");" + NL + "\t\t\t";
  protected final String TEXT_17 = " - Processed records count: \" + nb_line_";
  protected final String TEXT_18 = NL + " ";
  protected final String TEXT_19 = "  " + NL + "  java.util.Properties props_";
  protected final String TEXT_20 = " = System.getProperties();" + NL + "  props_";
  protected final String TEXT_21 = ".put(\"socksProxyPort\", ";
  protected final String TEXT_22 = ");" + NL + "  props_";
  protected final String TEXT_23 = ".put(\"socksProxyHost\", ";
  protected final String TEXT_24 = ".put(\"java.net.socks.username\", ";
  protected final String TEXT_25 = ");" + NL + "  ";
  protected final String TEXT_26 = " " + NL + "  String decryptedProxyPassword_";
  protected final String TEXT_27 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_28 = ");";
  protected final String TEXT_29 = NL + "  String decryptedProxyPassword_";
  protected final String TEXT_30 = " = ";
  protected final String TEXT_31 = "; ";
  protected final String TEXT_32 = NL + NL + "  props_";
  protected final String TEXT_33 = ".put(\"java.net.socks.password\", decryptedProxyPassword_";
  protected final String TEXT_34 = ");" + NL + "  java.net.Authenticator.setDefault(new java.net.Authenticator() {" + NL + "        public java.net.PasswordAuthentication getPasswordAuthentication() {" + NL + "            return new java.net.PasswordAuthentication(";
  protected final String TEXT_35 = ", decryptedProxyPassword_";
  protected final String TEXT_36 = ".toCharArray());" + NL + "        }" + NL + "  });";
  protected final String TEXT_37 = NL + "\t\tlog.debug(\"";
  protected final String TEXT_38 = " - \" + ";
  protected final String TEXT_39 = ");" + NL + "\t";
  protected final String TEXT_40 = NL + "\tcom.enterprisedt.net.ftp.FTPClient ftp_";
  protected final String TEXT_41 = " = new com.enterprisedt.net.ftp.FTPClient();" + NL + "\tftp_";
  protected final String TEXT_42 = ".setRemoteHost(";
  protected final String TEXT_43 = ");" + NL + "\tftp_";
  protected final String TEXT_44 = ".setRemotePort(";
  protected final String TEXT_45 = ");" + NL + "" + NL + "\t";
  protected final String TEXT_46 = NL + "    \tftp_";
  protected final String TEXT_47 = ".setConnectMode(com.enterprisedt.net.ftp.FTPConnectMode.ACTIVE);" + NL + "\t";
  protected final String TEXT_48 = ".setConnectMode(com.enterprisedt.net.ftp.FTPConnectMode.PASV);" + NL + "\t";
  protected final String TEXT_49 = NL + "\tftp_";
  protected final String TEXT_50 = ".setControlEncoding(";
  protected final String TEXT_51 = NL + "\t\tlog.info(\"";
  protected final String TEXT_52 = " - Attempt to connect to '\" + ";
  protected final String TEXT_53 = " + \"' with username '\" +";
  protected final String TEXT_54 = "+ \"'.\");" + NL + "\t";
  protected final String TEXT_55 = ".connect();  " + NL + "\t" + NL + "\t";
  protected final String TEXT_56 = " " + NL + "\t\t        " + NL + "\t";
  protected final String TEXT_57 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_58 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_59 = NL + "   \t" + NL + "\tftp_";
  protected final String TEXT_60 = ".login(";
  protected final String TEXT_61 = ", decryptedPassword_";
  protected final String TEXT_62 = ");  " + NL + "  \t";
  protected final String TEXT_63 = " - Connect to '\" + ";
  protected final String TEXT_64 = " + \"' has succeeded.\");" + NL + "\t";
  protected final String TEXT_65 = NL + "\tglobalMap.put(\"conn_";
  protected final String TEXT_66 = "\",ftp_";
  protected final String TEXT_67 = NL + "\tclass MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {" + NL + "\t";
  protected final String TEXT_68 = " " + NL + "      \t\tString decryptedPassphrase_";
  protected final String TEXT_69 = NL + "      \t\tString decryptedPassphrase_";
  protected final String TEXT_70 = NL + NL + "\t\tString passphrase_";
  protected final String TEXT_71 = " = decryptedPassphrase_";
  protected final String TEXT_72 = ";" + NL + "" + NL + "\t\tpublic String getPassphrase() { return passphrase_";
  protected final String TEXT_73 = "; }" + NL + "" + NL + "\t\tpublic String getPassword() { return null; } " + NL + "" + NL + "\t\tpublic boolean promptPassword(String arg0) { return true; } " + NL + "" + NL + "\t\tpublic boolean promptPassphrase(String arg0) { return true; } " + NL + "" + NL + "\t\tpublic boolean promptYesNo(String arg0) { return true; } " + NL + "" + NL + "\t\tpublic void showMessage(String arg0) { } " + NL + "" + NL + "\t\tpublic String[] promptKeyboardInteractive(String destination, String name, String instruction, String[] prompt," + NL + "\t\tboolean[] echo) {" + NL + "\t\t" + NL + "    \t";
  protected final String TEXT_74 = " " + NL + "    \t" + NL + "    \t";
  protected final String TEXT_75 = NL + "    \t" + NL + "\t\t\tString[] password_";
  protected final String TEXT_76 = " = {decryptedPassword_";
  protected final String TEXT_77 = "};" + NL + "\t\t\treturn password_";
  protected final String TEXT_78 = ";" + NL + "\t\t}" + NL + "\t};" + NL + "\tfinal com.jcraft.jsch.UserInfo defaultUserInfo_";
  protected final String TEXT_79 = " = new MyUserInfo();" + NL + "\t" + NL + "\t";
  protected final String TEXT_80 = NL + "\t" + NL + "\t";
  protected final String TEXT_81 = NL + NL + "boolean retry_";
  protected final String TEXT_82 = " = false;" + NL + "int retry_count_";
  protected final String TEXT_83 = " = 0;" + NL + "int retry_max_";
  protected final String TEXT_84 = " = 5;" + NL + "" + NL + "com.jcraft.jsch.Session session_";
  protected final String TEXT_85 = " = null;" + NL + "com.jcraft.jsch.Channel channel_";
  protected final String TEXT_86 = " = null;" + NL + "" + NL + "do {" + NL + "\tretry_";
  protected final String TEXT_87 = " = false;" + NL + "\t\t" + NL + "    com.jcraft.jsch.JSch jsch_";
  protected final String TEXT_88 = " = new com.jcraft.jsch.JSch(); " + NL + "    ";
  protected final String TEXT_89 = NL + "    \t";
  protected final String TEXT_90 = NL + "    \t\tlog.info(\"";
  protected final String TEXT_91 = " - SFTP authentication using a public key.\");" + NL + "    \t\tlog.debug(\"";
  protected final String TEXT_92 = " - Private key: '\" + ";
  protected final String TEXT_93 = " + \"'.\");" + NL + "    \t";
  protected final String TEXT_94 = NL + "    \tjsch_";
  protected final String TEXT_95 = ".addIdentity(";
  protected final String TEXT_96 = ", defaultUserInfo_";
  protected final String TEXT_97 = ".getPassphrase());";
  protected final String TEXT_98 = NL + "    " + NL + "    session_";
  protected final String TEXT_99 = " = jsch_";
  protected final String TEXT_100 = ".getSession(";
  protected final String TEXT_101 = ", ";
  protected final String TEXT_102 = ");" + NL + "    session_";
  protected final String TEXT_103 = ".setConfig(\"PreferredAuthentications\", \"publickey,password,keyboard-interactive,gssapi-with-mic\");" + NL + "    ";
  protected final String TEXT_104 = " " + NL + "    \t";
  protected final String TEXT_105 = " - SFTP authentication using a password.\");" + NL + "    \t";
  protected final String TEXT_106 = NL + "      \t\t" + NL + "    \t";
  protected final String TEXT_107 = NL + "       \t" + NL + "    \tsession_";
  protected final String TEXT_108 = ".setPassword(decryptedPassword_";
  protected final String TEXT_109 = "); ";
  protected final String TEXT_110 = ".setUserInfo(defaultUserInfo_";
  protected final String TEXT_111 = NL + "    \tif((\"true\").equals(System.getProperty(\"http.proxySet\")) ){" + NL + "    \t\tcom.jcraft.jsch.ProxyHTTP proxy_";
  protected final String TEXT_112 = " = new com.jcraft.jsch.ProxyHTTP(System.getProperty(\"http.proxyHost\"),Integer.parseInt(System.getProperty(\"http.proxyPort\")));" + NL + "    \t\tif(!\"\".equals(System.getProperty(\"http.proxyUser\"))){" + NL + "    \t\t\tproxy_";
  protected final String TEXT_113 = ".setUserPasswd(System.getProperty(\"http.proxyUser\"),System.getProperty(\"http.proxyPassword\"));" + NL + "    \t\t}" + NL + "    \t\tsession_";
  protected final String TEXT_114 = ".setProxy(proxy_";
  protected final String TEXT_115 = ");" + NL + "    \t}";
  protected final String TEXT_116 = NL + "    \tlog.info(\"";
  protected final String TEXT_117 = " - Attempt to connect to  '\" + ";
  protected final String TEXT_118 = " + \"' with username '\" + ";
  protected final String TEXT_119 = " + \"'.\");";
  protected final String TEXT_120 = NL + NL + "\tchannel_";
  protected final String TEXT_121 = " = null;" + NL + "  \ttry {" + NL + "      \tsession_";
  protected final String TEXT_122 = ".connect();" + NL + "      \tchannel_";
  protected final String TEXT_123 = " = session_";
  protected final String TEXT_124 = ".openChannel(\"sftp\");" + NL + "      \tchannel_";
  protected final String TEXT_125 = ".connect();" + NL + "      \t";
  protected final String TEXT_126 = NL + "      \t\tlog.info(\"";
  protected final String TEXT_127 = " + \"' has succeeded.\");" + NL + "      \t";
  protected final String TEXT_128 = NL + "  \t} catch (com.jcraft.jsch.JSchException e_";
  protected final String TEXT_129 = ") {" + NL + "  \t\ttry {" + NL + "\t  \t\tif(channel_";
  protected final String TEXT_130 = "!=null) {" + NL + "\t  \t\t\tchannel_";
  protected final String TEXT_131 = ".disconnect();" + NL + "\t  \t\t}" + NL + "\t  \t\t" + NL + "\t  \t\tif(session_";
  protected final String TEXT_132 = "!=null) {" + NL + "\t  \t\t\tsession_";
  protected final String TEXT_133 = ".disconnect();" + NL + "\t  \t\t}" + NL + "  \t\t} catch(java.lang.Exception ce_";
  protected final String TEXT_134 = ") {" + NL + "  \t\t\t";
  protected final String TEXT_135 = NL + "      \t\tlog.warn(\"";
  protected final String TEXT_136 = " - close sftp connection failed : \" + ce_";
  protected final String TEXT_137 = ".getClass() + \" : \" + ce_";
  protected final String TEXT_138 = ".getMessage());" + NL + "      \t\t";
  protected final String TEXT_139 = NL + "  \t\t}" + NL + "\t\t" + NL + "\t\tString message_";
  protected final String TEXT_140 = " = new TalendException(null, null, null).getExceptionCauseMessage(e_";
  protected final String TEXT_141 = ");" + NL + "\t\tif(message_";
  protected final String TEXT_142 = ".contains(\"Signature length not correct\") || message_";
  protected final String TEXT_143 = ".contains(\"connection is closed by foreign host\")) {" + NL + "\t\t\tretry_";
  protected final String TEXT_144 = " = true;" + NL + "\t\t\tretry_count_";
  protected final String TEXT_145 = "++;" + NL + "\t\t\t";
  protected final String TEXT_146 = " - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : \" + retry_count_";
  protected final String TEXT_147 = ");" + NL + "      \t\t";
  protected final String TEXT_148 = NL + "\t\t} else {" + NL + "\t\t\tthrow e_";
  protected final String TEXT_149 = ";" + NL + "\t\t}" + NL + "  \t}" + NL + "} while(retry_";
  protected final String TEXT_150 = " && (retry_count_";
  protected final String TEXT_151 = " < retry_max_";
  protected final String TEXT_152 = "));" + NL + "" + NL + "com.jcraft.jsch.ChannelSftp c_";
  protected final String TEXT_153 = " = (com.jcraft.jsch.ChannelSftp)channel_";
  protected final String TEXT_154 = ";" + NL + "\t" + NL + "\t";
  protected final String TEXT_155 = NL + "\t\tc_";
  protected final String TEXT_156 = ".setFilenameEncoding(";
  protected final String TEXT_157 = NL + "\t" + NL + "\tglobalMap.put(\"conn_";
  protected final String TEXT_158 = "\", c_";
  protected final String TEXT_159 = NL + NL + "\t";
  protected final String TEXT_160 = NL + NL + "\tclass MyTrust_";
  protected final String TEXT_161 = " {" + NL + "" + NL + "\t\tprivate javax.net.ssl.TrustManager[] getTrustManagers() " + NL + "\t\tthrows java.security.KeyStoreException, java.security.NoSuchAlgorithmException, " + NL + "\t\t\tjava.security.cert.CertificateException, java.security.UnrecoverableKeyException," + NL + "\t\t\tjava.io.IOException {" + NL + "\t\t\tjava.security.KeyStore ks = java.security.KeyStore.getInstance(\"JKS\");" + NL;
  protected final String TEXT_162 = " " + NL + "\t\t\t\tString decryptedKeyStorePassword_";
  protected final String TEXT_163 = NL + "\t\t\t\tString decryptedKeyStorePassword_";
  protected final String TEXT_164 = NL + "\t\t\tks.load(new java.io.FileInputStream(";
  protected final String TEXT_165 = "), decryptedKeyStorePassword_";
  protected final String TEXT_166 = ".toCharArray());" + NL + "\t\t\tjavax.net.ssl.TrustManagerFactory tmf = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm());" + NL + "\t\t\ttmf.init(ks);" + NL + "\t\t\treturn tmf.getTrustManagers();" + NL + "\t\t}" + NL + "\t}" + NL + "\tjavax.net.ssl.SSLContext sslContext_";
  protected final String TEXT_167 = " = null;" + NL + "\tjavax.net.ssl.TrustManager[] trustManager_";
  protected final String TEXT_168 = " = null;" + NL + "\tjavax.net.ssl.SSLSocketFactory sslSocketFactory_";
  protected final String TEXT_169 = " = null;" + NL + "\torg.apache.commons.net.ftp.FTPSClient ftp_";
  protected final String TEXT_170 = " = null;" + NL + "\tMyTrust_";
  protected final String TEXT_171 = " myTrust_";
  protected final String TEXT_172 = " = null;" + NL + "" + NL + "\ttry {" + NL + "\t\tsslContext_";
  protected final String TEXT_173 = " = javax.net.ssl.SSLContext.getInstance(\"SSL\");" + NL + "\t\tmyTrust_";
  protected final String TEXT_174 = " = new MyTrust_";
  protected final String TEXT_175 = "();" + NL + "\t\ttrustManager_";
  protected final String TEXT_176 = " = myTrust_";
  protected final String TEXT_177 = ".getTrustManagers();" + NL + "\t\tsslContext_";
  protected final String TEXT_178 = ".init(null, trustManager_";
  protected final String TEXT_179 = ", new java.security.SecureRandom());" + NL + "\t\tsslSocketFactory_";
  protected final String TEXT_180 = " = sslContext_";
  protected final String TEXT_181 = ".getSocketFactory();" + NL + "\t\tboolean isHTTPProxyUsed = \"true\".equals(System.getProperty(\"http.proxySet\"));" + NL + "\t\tif (isHTTPProxyUsed) {" + NL + "\t\t\tString httpProxyHost = System.getProperty(\"http.proxyHost\");" + NL + "\t\t\tint httpProxyPort = Integer.getInteger(\"http.proxyPort\");" + NL + "\t\t\tString httpProxyUser = System.getProperty(\"http.proxyUser\");" + NL + "\t\t\tString httpProxyPass = System.getProperty(\"http.proxyPassword\");" + NL + "" + NL + "\t\t\tftp_";
  protected final String TEXT_182 = " = new org.talend.ftp.HTTPProxyFTPSClient(";
  protected final String TEXT_183 = ", sslContext_";
  protected final String TEXT_184 = ", httpProxyHost, httpProxyPort, httpProxyUser, httpProxyPass);" + NL + "\t\t} else {" + NL + "\t\t\tftp_";
  protected final String TEXT_185 = " = new  org.talend.ftp.SSLSessionReuseFTPSClient(";
  protected final String TEXT_186 = ");" + NL + "\t\t}" + NL + "\t\tftp_";
  protected final String TEXT_187 = ");" + NL + "" + NL + "\t\t";
  protected final String TEXT_188 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_189 = " -FTPS security Mode is ";
  protected final String TEXT_190 = ".\");" + NL + "\t\t\tlog.info(\"";
  protected final String TEXT_191 = "+ \"'.\");" + NL + "\t\t";
  protected final String TEXT_192 = NL + "\t\tftp_";
  protected final String TEXT_193 = ".connect(";
  protected final String TEXT_194 = ",";
  protected final String TEXT_195 = ");" + NL + "\t\t";
  protected final String TEXT_196 = " + \"' has succeeded.\");" + NL + "\t\t";
  protected final String TEXT_197 = ".setRemoteVerificationEnabled(";
  protected final String TEXT_198 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_199 = NL + NL + "\t\tboolean isLoginSuccessful_";
  protected final String TEXT_200 = " = ftp_";
  protected final String TEXT_201 = ");" + NL + "" + NL + "\t\tif (!isLoginSuccessful_";
  protected final String TEXT_202 = ") {" + NL + "\t\t\tthrow new RuntimeException(\"Login failed\");" + NL + "\t\t}" + NL + "" + NL + "\t\tftp_";
  protected final String TEXT_203 = ".setFileType(org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE);";
  protected final String TEXT_204 = NL + "\t\t\tftp_";
  protected final String TEXT_205 = ".execPBSZ(";
  protected final String TEXT_206 = ".execPROT(";
  protected final String TEXT_207 = NL + "\t} catch (Exception e) {" + NL + "\t\t";
  protected final String TEXT_208 = NL + "\t\t\tlog.error(\"";
  protected final String TEXT_209 = " - Can't create connection: \" + e.getMessage());" + NL + "\t\t";
  protected final String TEXT_210 = NL + "\t\tthrow e;" + NL + "\t}" + NL;
  protected final String TEXT_211 = ".enterLocalPassiveMode();";
  protected final String TEXT_212 = NL + "\t\t\tlog.debug(\"";
  protected final String TEXT_213 = " - Using the passive mode.\");";
  protected final String TEXT_214 = NL + NL + "\tglobalMap.put(\"conn_";
  protected final String TEXT_215 = "\", ftp_";
  protected final String TEXT_216 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	//this util class use by set log4j debug paramters
	class DefaultLog4jFileUtil {
	
		INode node = null;
	    String cid = null;
 		boolean isLog4jEnabled = false;
 		String label = null;
 		
 		public DefaultLog4jFileUtil(){
 		}
 		public DefaultLog4jFileUtil(INode node) {
 			this.node = node;
 			this.cid = node.getUniqueName();
 			this.label = cid;
			this.isLog4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
 		}
 		
 		public void setCid(String cid) {
 			this.cid = cid;
 		}
 		
		//for all tFileinput* components 
		public void startRetriveDataInfo() {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_1);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_2);
    
			}
		}
		
		public void retrievedDataNumberInfo() {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    
			}
		}
		
		public void retrievedDataNumberInfoFromGlobalMap(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_7);
    
			}
		}
		
		//for all tFileinput* components 
		public void retrievedDataNumberInfo(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    
			}
		}
		
		public void writeDataFinishInfo(INode node) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    
			}
		}
		
 		//TODO delete it and remove all log4jSb parameter from components
		public void componentStartInfo(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_10);
    
			}
		}
		
		//TODO rename or delete it
		public void debugRetriveData(INode node,boolean hasIncreased) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid);
    stringBuffer.append(hasIncreased?"":"+1");
    stringBuffer.append(TEXT_12);
    
			}
		}
		
		//TODO rename or delete it
		public void debugRetriveData(INode node) {
			debugRetriveData(node,true);
		}
		
		//TODO rename or delete it
		public void debugWriteData(INode node) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
			}
		}
		
		public void logCurrentRowNumberInfo() {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_16);
    
			}
		}
		
		public void logDataCountInfo() {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    
			}
		}
	}
	
	final DefaultLog4jFileUtil log4jFileUtil = new DefaultLog4jFileUtil((INode)(((org.talend.designer.codegen.config.CodeGeneratorArgument)argument).getArgument()));
	
    stringBuffer.append(TEXT_18);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();
String host = ElementParameterParser.getValue(node, "__HOST__");
String port = ElementParameterParser.getValue(node, "__PORT__");
String ftpsPort = ElementParameterParser.getValue(node, "__FTPS_PORT__");
String user = ElementParameterParser.getValue(node, "__USER__");
boolean use_encoding = "true".equals(ElementParameterParser.getValue(node, "__USE_ENCODING__"));

String connectMode = ElementParameterParser.getValue(node, "__CONNECT_MODE__");
boolean useProxy = ("true").equals(ElementParameterParser.getValue(node, "__USE_PROXY__"));
String proxyHost = ElementParameterParser.getValue(node, "__PROXY_HOST__");
String proxyPort = ElementParameterParser.getValue(node, "__PROXY_PORT__");
String proxyUser = ElementParameterParser.getValue(node, "__PROXY_USERNAME__");
boolean sftp = ("true").equals(ElementParameterParser.getValue(node, "__SFTP__"));
String authMethod = ElementParameterParser.getValue(node, "__AUTH_METHOD__");
String privateKey = ElementParameterParser.getValue(node, "__PRIVATEKEY__");
boolean ftps = ("true").equals(ElementParameterParser.getValue(node, "__FTPS__"));
String keystoreFile = ElementParameterParser.getValue(node, "__KEYSTORE_FILE__");
String sEncoding = ElementParameterParser.getValue(node, "__ENCODING__");
String securityMode = ElementParameterParser.getValue(node, "__SECURITY_MODE__");
String protectionLevel = ElementParameterParser.getValue(node, "__FTPS_PROT__");
String protectionBufferSize = ElementParameterParser.getValue(node, "__FTPS_PROTECTION_BUFF_SIZE__");
boolean useRemoteVerification = ("true").equals(ElementParameterParser.getValue(node, "__REMOTE_VERIFICATION__"));
boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
String passwordFieldName = "";

if (useProxy) {

    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(proxyPort );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(proxyUser );
    stringBuffer.append(TEXT_25);
    
passwordFieldName = "__PROXY_PASSWORD__";
if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(proxyUser );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_36);
    
}

if (!sftp && !ftps) { // *** ftp *** //
  	if(isLog4jEnabled){
    stringBuffer.append(TEXT_37);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_38);
    stringBuffer.append((("ACTIVE").equals(connectMode))?"\"Using the active mode.\"":"\"Using the passive mode.\"");
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_44);
    stringBuffer.append(port );
    stringBuffer.append(TEXT_45);
    if (("ACTIVE").equals(connectMode)) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_47);
    } else {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_50);
    stringBuffer.append(sEncoding);
    stringBuffer.append(TEXT_39);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_53);
    stringBuffer.append(user );
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_55);
    
	passwordFieldName = "__PASS__";
	
    stringBuffer.append(TEXT_56);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_60);
    stringBuffer.append(user );
    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_62);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    
} else if (!ftps) { // *** sftp *** //

    stringBuffer.append(TEXT_67);
    
        passwordFieldName = "__PASSPHRASE__";
        if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
        
    stringBuffer.append(TEXT_68);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_73);
    
    	passwordFieldName = "__PASS__";
    	
    stringBuffer.append(TEXT_74);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_79);
    
	passwordFieldName = "__PASS__";
	
    stringBuffer.append(TEXT_80);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    if (("PUBLICKEY").equals(authMethod)){
    stringBuffer.append(TEXT_89);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(privateKey);
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(privateKey );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(host);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(port);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_103);
    if (("PASSWORD").equals(authMethod)) {
    stringBuffer.append(TEXT_104);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_105);
    }
    stringBuffer.append(TEXT_106);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_109);
    if (!useProxy) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_89);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_116);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_117);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_122);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_124);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_125);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_126);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_129);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_130);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_131);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_134);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_135);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_141);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_145);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_126);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_149);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_154);
    if(use_encoding) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(sEncoding);
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_28);
    
} else {  // *** ftps *** //

    stringBuffer.append(TEXT_159);
    stringBuffer.append(TEXT_160);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_161);
    
			passwordFieldName = "__KEYSTORE_PASS__";
			if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {

    stringBuffer.append(TEXT_162);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    
			} else {

    stringBuffer.append(TEXT_163);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    
			}

    stringBuffer.append(TEXT_164);
    stringBuffer.append(keystoreFile);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_166);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_167);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_168);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_169);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_170);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_172);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_173);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_175);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_176);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_177);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_178);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_179);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_180);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_181);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_182);
    stringBuffer.append("IMPLICIT".equals(securityMode));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_184);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_185);
    stringBuffer.append("IMPLICIT".equals(securityMode));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_186);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_50);
    stringBuffer.append(sEncoding );
    stringBuffer.append(TEXT_187);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_188);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_189);
    stringBuffer.append(securityMode);
    stringBuffer.append(TEXT_190);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(user );
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_193);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_194);
    stringBuffer.append(ftpsPort);
    stringBuffer.append(TEXT_195);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_188);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(host );
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_192);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_197);
    stringBuffer.append(useRemoteVerification );
    stringBuffer.append(TEXT_195);
    
		passwordFieldName = "__PASS__";
		
    stringBuffer.append(TEXT_198);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_199);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_200);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_60);
    stringBuffer.append(user );
    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_201);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_202);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_203);
    
		if (protectionBufferSize != null && !protectionBufferSize.isEmpty() ) {

    stringBuffer.append(TEXT_204);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_205);
    stringBuffer.append(protectionBufferSize );
    stringBuffer.append(TEXT_28);
    
		}

		if (protectionLevel != null && !protectionLevel.isEmpty()) {

    stringBuffer.append(TEXT_204);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_206);
    stringBuffer.append(protectionLevel );
    stringBuffer.append(TEXT_28);
    
		}

    stringBuffer.append(TEXT_207);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_208);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    
	if ("PASSIVE".equals(connectMode)) {

    stringBuffer.append(TEXT_192);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_211);
    
		if (isLog4jEnabled) {

    stringBuffer.append(TEXT_212);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_213);
    
		}
	}

    stringBuffer.append(TEXT_214);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_215);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    
}

    stringBuffer.append(TEXT_216);
    return stringBuffer.toString();
  }
}
