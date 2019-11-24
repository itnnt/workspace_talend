package org.talend.designer.codegen.translators.internet;

import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TFileFetchMainJava
{
  protected static String nl;
  public static synchronized TFileFetchMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TFileFetchMainJava result = new TFileFetchMainJava();
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
  protected final String TEXT_18 = NL + "java.io.InputStream retIS_";
  protected final String TEXT_19 = " = null;" + NL;
  protected final String TEXT_20 = "\t" + NL + "\tjava.net.URI uriToFetch_";
  protected final String TEXT_21 = " = null;" + NL + "\ttry {";
  protected final String TEXT_22 = NL + "\t\t\tjava.net.URL url_";
  protected final String TEXT_23 = " = new java.net.URL(";
  protected final String TEXT_24 = ");" + NL + "\t\t\turiToFetch_";
  protected final String TEXT_25 = " = new java.net.URI(" + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_26 = ".getProtocol()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_27 = ".getUserInfo()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_28 = ".getHost()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_29 = ".getPort()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_30 = ".getPath()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_31 = ".getQuery()," + NL + "\t\t\t\t\t\t\t\turl_";
  protected final String TEXT_32 = ".getRef());";
  protected final String TEXT_33 = NL + "\t\t\turiToFetch_";
  protected final String TEXT_34 = " = new java.net.URI(";
  protected final String TEXT_35 = ");";
  protected final String TEXT_36 = NL + "\t} " + NL + "\tcatch (Exception e) {";
  protected final String TEXT_37 = NL + "\t\t\tlog.error(\"";
  protected final String TEXT_38 = "\", e);";
  protected final String TEXT_39 = NL + "\t\t\tSystem.err.println(\"";
  protected final String TEXT_40 = "\");";
  protected final String TEXT_41 = NL + "\t}" + NL + "\t";
  protected final String TEXT_42 = NL + "\t" + NL + "\t\tclass SocketFactory_";
  protected final String TEXT_43 = " implements org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory {" + NL + "" + NL + "\t\t\tprivate javax.net.ssl.SSLContext sslcontext = null;" + NL + "" + NL + "\t\t\tprivate javax.net.ssl.SSLContext createSSLContext() {" + NL + "\t\t\t\tjavax.net.ssl.SSLContext sslcontext = null;" + NL + "" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tsslcontext = javax.net.ssl.SSLContext.getInstance(\"SSL\");" + NL + "\t\t\t\t\tsslcontext.init(null, new javax.net.ssl.TrustManager[] { new TrustAnyTrustManager() }, new java.security.SecureRandom());" + NL + "\t\t\t\t} catch (java.security.NoSuchAlgorithmException e) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_44 = NL + "\t\t\t\t\t\tlog.error(\"";
  protected final String TEXT_45 = " - \" + e.getMessage());" + NL + "\t\t\t\t\t";
  protected final String TEXT_46 = NL + "\t\t\t\t\te.printStackTrace();" + NL + "\t\t\t\t} catch (java.security.KeyManagementException e) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_47 = NL + "\t\t\t\t\te.printStackTrace();" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn sslcontext;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tprivate javax.net.ssl.SSLContext getSSLContext() {" + NL + "" + NL + "\t\t\t\tif (this.sslcontext == null) {" + NL + "\t\t\t\t\tthis.sslcontext = createSSLContext();" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn this.sslcontext;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.net.Socket createSocket(java.net.Socket socket, String host, int port, boolean autoClose)" + NL + "\t\t\t\tthrows java.io.IOException, java.net.UnknownHostException {" + NL + "\t\t\t\treturn getSSLContext().getSocketFactory().createSocket(socket, host, port, autoClose);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.net.Socket createSocket(String host, int port) throws java.io.IOException, java.net.UnknownHostException {" + NL + "\t\t\t\treturn getSSLContext().getSocketFactory().createSocket(host, port);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.net.Socket createSocket(String host, int port, java.net.InetAddress clientHost, int clientPort)" + NL + "\t\t\t\tthrows java.io.IOException, java.net.UnknownHostException {" + NL + "\t\t\t\treturn getSSLContext().getSocketFactory().createSocket(host, port, clientHost, clientPort);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.net.Socket createSocket(String host, int port, java.net.InetAddress localAddress, int localPort, org.apache.commons.httpclient.params.HttpConnectionParams params) " + NL + "\t\t\t\tthrows java.io.IOException, java.net.UnknownHostException, org.apache.commons.httpclient.ConnectTimeoutException {" + NL + "" + NL + "\t\t\t\tif (params == null) {" + NL + "\t\t\t\t\tthrow new IllegalArgumentException(\"Parameters may not be null\");" + NL + "\t\t\t\t}" + NL + "\t\t\t\tint timeout = params.getConnectionTimeout();" + NL + "\t\t\t\tjavax.net.SocketFactory socketfactory = getSSLContext().getSocketFactory();" + NL + "" + NL + "\t\t\t\tif (timeout == 0) {" + NL + "\t\t\t\t\treturn socketfactory.createSocket(host, port, localAddress, localPort);" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tjava.net.Socket socket = socketfactory.createSocket();" + NL + "\t\t\t\t\tjava.net.SocketAddress localaddr = new java.net.InetSocketAddress(localAddress, localPort);" + NL + "\t\t\t\t\tjava.net.SocketAddress remoteaddr = new java.net.InetSocketAddress(host, port);" + NL + "\t\t\t\t\tsocket.bind(localaddr);" + NL + "\t\t\t\t\tsocket.connect(remoteaddr, timeout);" + NL + "\t\t\t\t\treturn socket;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tclass TrustAnyTrustManager implements javax.net.ssl.X509TrustManager {" + NL + "\t\t\t\tpublic void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)" + NL + "\t\t\t\t\tthrows java.security.cert.CertificateException {" + NL + "\t\t\t\t}" + NL + "\t\t\t\tpublic void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)" + NL + "\t\t\t\t\tthrows java.security.cert.CertificateException {" + NL + "\t\t\t\t}" + NL + "\t\t\t\tpublic java.security.cert.X509Certificate[] getAcceptedIssuers() {" + NL + "\t\t\t\t\treturn new java.security.cert.X509Certificate[] {};" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\t\torg.apache.commons.httpclient.protocol.Protocol myhttps_";
  protected final String TEXT_48 = " = new org.apache.commons.httpclient.protocol.Protocol(\"https\", new SocketFactory_";
  protected final String TEXT_49 = "(), 443);" + NL + "\t\t\torg.apache.commons.httpclient.protocol.Protocol.registerProtocol(\"https\", myhttps_";
  protected final String TEXT_50 = NL + "\torg.apache.commons.httpclient.HttpClient client_";
  protected final String TEXT_51 = " = new org.apache.commons.httpclient.HttpClient();" + NL + "\t";
  protected final String TEXT_52 = NL + "\t\tlog.info(\"";
  protected final String TEXT_53 = " - Connection attempt to '\" + ";
  protected final String TEXT_54 = ");" + NL + "\t";
  protected final String TEXT_55 = NL + "\tclient_";
  protected final String TEXT_56 = ".getHttpConnectionManager().getParams().setConnectionTimeout(";
  protected final String TEXT_57 = " - Connection to '\" +  ";
  protected final String TEXT_58 = " + \"' has succeeded.\");" + NL + "\t";
  protected final String TEXT_59 = ".getParams().setCookiePolicy(org.apache.commons.httpclient.cookie.CookiePolicy.";
  protected final String TEXT_60 = ".getParams().setBooleanParameter(org.apache.commons.httpclient.params.HttpMethodParams.SINGLE_COOKIE_HEADER, true);" + NL + "\t";
  protected final String TEXT_61 = NL + "\t";
  protected final String TEXT_62 = NL + "\t\tList<org.apache.commons.httpclient.Cookie> cookieList_";
  protected final String TEXT_63 = " = null;" + NL + "\t\tjava.io.FileInputStream fis_";
  protected final String TEXT_64 = " = null;" + NL + "\t\tjava.io.ObjectInputStream is_";
  protected final String TEXT_65 = " = null;" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tcookieList_";
  protected final String TEXT_66 = " = new java.util.ArrayList<org.apache.commons.httpclient.Cookie>();" + NL + "\t\t\tfis_";
  protected final String TEXT_67 = " = new java.io.FileInputStream(new java.io.File(";
  protected final String TEXT_68 = "));" + NL + "\t\t\tis_";
  protected final String TEXT_69 = " = new java.io.ObjectInputStream(fis_";
  protected final String TEXT_70 = ");" + NL + "\t\t\tObject obj_";
  protected final String TEXT_71 = " = is_";
  protected final String TEXT_72 = ".readObject();" + NL + "" + NL + "\t\t\twhile (obj_";
  protected final String TEXT_73 = " != null) {" + NL + "\t\t\t\tcookieList_";
  protected final String TEXT_74 = ".add((org.apache.commons.httpclient.Cookie) obj_";
  protected final String TEXT_75 = ");" + NL + "" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tobj_";
  protected final String TEXT_76 = ".readObject();" + NL + "\t\t\t\t} catch (java.io.IOException e) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_77 = NL + "\t\t\t\t\t\tlog.warn(\"";
  protected final String TEXT_78 = NL + "\t\t\t\t\tobj_";
  protected final String TEXT_79 = " = null;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t} catch (java.io.FileNotFoundException e1) {" + NL + "\t\t\t";
  protected final String TEXT_80 = NL + "\t\t\t\tlog.error(\"";
  protected final String TEXT_81 = " - \" + e1.getMessage());" + NL + "\t\t\t";
  protected final String TEXT_82 = NL + "\t\t\te1.printStackTrace();" + NL + "\t\t} catch (java.io.IOException e) {" + NL + "\t\t\t";
  protected final String TEXT_83 = " - \" + e.getMessage());" + NL + "\t\t\t";
  protected final String TEXT_84 = NL + "\t\t\te.printStackTrace();" + NL + "\t\t} catch (java.lang.ClassNotFoundException e) {" + NL + "\t\t\t";
  protected final String TEXT_85 = NL + "\t\t\te.printStackTrace();" + NL + "\t\t} finally {" + NL + "\t\t\tif (is_";
  protected final String TEXT_86 = " != null) is_";
  protected final String TEXT_87 = ".close();" + NL + "\t\t\tif (fis_";
  protected final String TEXT_88 = " != null) fis_";
  protected final String TEXT_89 = ".close();" + NL + "\t\t}" + NL + "" + NL + "\t\tif (cookieList_";
  protected final String TEXT_90 = " != null)" + NL + "\t\t\tclient_";
  protected final String TEXT_91 = ".getState().addCookies(cookieList_";
  protected final String TEXT_92 = ".toArray(new org.apache.commons.httpclient.Cookie[0]));" + NL + "\t";
  protected final String TEXT_93 = " " + NL + "\t\tclient_";
  protected final String TEXT_94 = ".getHostConfiguration().setProxy(";
  protected final String TEXT_95 = ", Integer.parseInt(";
  protected final String TEXT_96 = "));" + NL + "\t        " + NL + "\t\t";
  protected final String TEXT_97 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_98 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_99 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_100 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_101 = " = ";
  protected final String TEXT_102 = "; ";
  protected final String TEXT_103 = NL + "\t   \t" + NL + "\t\t";
  protected final String TEXT_104 = NL + "\t\t\tclient_";
  protected final String TEXT_105 = ".getState().setProxyCredentials(" + NL + "\t\t\tnew org.apache.commons.httpclient.auth.AuthScope( ";
  protected final String TEXT_106 = "), null )," + NL + "\t\t\tnew org.apache.commons.httpclient.NTCredentials( ";
  protected final String TEXT_107 = "," + NL + "\t\t\tdecryptedPassword_";
  protected final String TEXT_108 = ", ";
  protected final String TEXT_109 = " ));" + NL + "\t\t";
  protected final String TEXT_110 = ".getState().setProxyCredentials(" + NL + "\t\t\tnew org.apache.commons.httpclient.auth.AuthScope(";
  protected final String TEXT_111 = "), null)," + NL + "\t\t\tnew org.apache.commons.httpclient.UsernamePasswordCredentials(";
  protected final String TEXT_112 = ", decryptedPassword_";
  protected final String TEXT_113 = "));" + NL + "\t\t";
  protected final String TEXT_114 = NL + "\t\tString decryptedPwd_";
  protected final String TEXT_115 = ");" + NL + "\t\t";
  protected final String TEXT_116 = ";" + NL + "\t\t";
  protected final String TEXT_117 = ".getState().setCredentials(org.apache.commons.httpclient.auth.AuthScope.ANY, new org.apache.commons.httpclient.NTCredentials(";
  protected final String TEXT_118 = ", decryptedPwd_";
  protected final String TEXT_119 = ", new java.net.URL(";
  protected final String TEXT_120 = ").getHost(), ";
  protected final String TEXT_121 = ".getState().setCredentials(org.apache.commons.httpclient.auth.AuthScope.ANY, new org.apache.commons.httpclient.UsernamePasswordCredentials(";
  protected final String TEXT_122 = NL + "\t\torg.apache.commons.httpclient.HttpMethod method_";
  protected final String TEXT_123 = " = new org.apache.commons.httpclient.methods.PostMethod(uriToFetch_";
  protected final String TEXT_124 = ".toASCIIString()";
  protected final String TEXT_125 = ".toString() ";
  protected final String TEXT_126 = NL + "\t\t\torg.apache.commons.httpclient.methods.multipart.StringPart common_";
  protected final String TEXT_127 = "_";
  protected final String TEXT_128 = " = new org.apache.commons.httpclient.methods.multipart.StringPart(";
  protected final String TEXT_129 = ");" + NL + "\t\t\t";
  protected final String TEXT_130 = NL + "\t\t\t\torg.apache.commons.httpclient.methods.multipart.FilePart file_";
  protected final String TEXT_131 = "  = new org.apache.commons.httpclient.methods.multipart.FilePart(";
  protected final String TEXT_132 = ", new java.io.File(";
  protected final String TEXT_133 = "), ";
  protected final String TEXT_134 = NL + "\t\torg.apache.commons.httpclient.methods.multipart.Part[] parts_";
  protected final String TEXT_135 = " = new org.apache.commons.httpclient.methods.multipart.Part[]{";
  protected final String TEXT_136 = ",";
  protected final String TEXT_137 = "};    " + NL + "\t\t((org.apache.commons.httpclient.methods.PostMethod)method_";
  protected final String TEXT_138 = ").setRequestEntity(new org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity(parts_";
  protected final String TEXT_139 = ", method_";
  protected final String TEXT_140 = ".getParams()));" + NL + "\t";
  protected final String TEXT_141 = " = new org.apache.commons.httpclient.methods.GetMethod(uriToFetch_";
  protected final String TEXT_142 = NL + "\t\t\tmethod_";
  protected final String TEXT_143 = ".addRequestHeader(";
  protected final String TEXT_144 = NL + "\tboolean isContinue_";
  protected final String TEXT_145 = " = true;" + NL + "\tint status_";
  protected final String TEXT_146 = ";" + NL + "\tString finalURL_";
  protected final String TEXT_147 = " = uriToFetch_";
  protected final String TEXT_148 = ";" + NL + "" + NL + "\ttry { // B_01" + NL + "\t\t";
  protected final String TEXT_149 = NL + "\t\t\tboolean redirect_";
  protected final String TEXT_150 = " = true;" + NL + "" + NL + "\t\t\twhile (redirect_";
  protected final String TEXT_151 = ") {" + NL + "\t\t\t\tstatus_";
  protected final String TEXT_152 = " = client_";
  protected final String TEXT_153 = ".executeMethod(method_";
  protected final String TEXT_154 = ");" + NL + "" + NL + "\t\t\t\tif ((status_";
  protected final String TEXT_155 = " == org.apache.commons.httpclient.HttpStatus.SC_MOVED_TEMPORARILY) " + NL + "\t\t\t\t\t|| (status_";
  protected final String TEXT_156 = " == org.apache.commons.httpclient.HttpStatus.SC_MOVED_PERMANENTLY)" + NL + "\t\t\t\t\t\t|| (status_";
  protected final String TEXT_157 = " == org.apache.commons.httpclient.HttpStatus.SC_SEE_OTHER) " + NL + "\t\t\t\t\t\t\t|| (status_";
  protected final String TEXT_158 = " == org.apache.commons.httpclient.HttpStatus.SC_TEMPORARY_REDIRECT)) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_159 = NL + "\t\t\t\t\t\tlog.info(\"";
  protected final String TEXT_160 = " - Closing the connection to the server.\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_161 = NL + "\t\t\t\t\tmethod_";
  protected final String TEXT_162 = ".releaseConnection();" + NL + "\t\t\t\t\t";
  protected final String TEXT_163 = " - Connection to the server closed.\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_164 = NL + NL + "\t\t\t\t\tString redirect_url_";
  protected final String TEXT_165 = " = method_";
  protected final String TEXT_166 = ".getResponseHeader(\"location\").getValue();" + NL + "                    if(!redirect_url_";
  protected final String TEXT_167 = ".startsWith(\"http\")){" + NL + "                        redirect_url_";
  protected final String TEXT_168 = ".getHostConfiguration().getProtocol().getScheme()+\"://\" + method_";
  protected final String TEXT_169 = ".getURI().getHost() + \":\" + method_";
  protected final String TEXT_170 = ".getURI().getPort() + redirect_url_";
  protected final String TEXT_171 = ";" + NL + "                    }" + NL + "" + NL + "                    if(status_";
  protected final String TEXT_172 = " == org.apache.commons.httpclient.HttpStatus.SC_SEE_OTHER";
  protected final String TEXT_173 = " || status_";
  protected final String TEXT_174 = " == org.apache.commons.httpclient.HttpStatus.SC_MOVED_TEMPORARILY";
  protected final String TEXT_175 = ") {" + NL + "                        method_";
  protected final String TEXT_176 = " = new org.apache.commons.httpclient.methods.GetMethod(redirect_url_";
  protected final String TEXT_177 = ");" + NL + "                    }" + NL + "                    else{" + NL + "                        method_";
  protected final String TEXT_178 = " = new org.apache.commons.httpclient.methods.";
  protected final String TEXT_179 = "Post";
  protected final String TEXT_180 = "Get";
  protected final String TEXT_181 = "Method(redirect_url_";
  protected final String TEXT_182 = ");" + NL + "                    }" + NL + "" + NL + "\t\t\t\t\tSystem.out.println(\"Redirect to: \" + method_";
  protected final String TEXT_183 = ".getURI());" + NL + "\t\t\t\t\tfinalURL_";
  protected final String TEXT_184 = ".getURI().toString();" + NL + "\t\t\t\t} else if (status_";
  protected final String TEXT_185 = " == org.apache.commons.httpclient.HttpStatus.SC_OK";
  protected final String TEXT_186 = ") {" + NL + "\t\t\t\t\tredirect_";
  protected final String TEXT_187 = " = false;" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tthrow new java.lang.Exception(\"Method failed: \" + method_";
  protected final String TEXT_188 = ".getStatusLine());" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_189 = NL + "\t\t\tstatus_";
  protected final String TEXT_190 = "  = client_";
  protected final String TEXT_191 = NL + "\t\t\tif (!(status_";
  protected final String TEXT_192 = ")) {      " + NL + "\t\t\t\tthrow new java.lang.Exception(\"Method failed: \" + method_";
  protected final String TEXT_193 = ".getStatusLine());" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_194 = NL + "\t} catch(java.lang.Exception e) {" + NL + "\t\t";
  protected final String TEXT_195 = NL + "\t\t\tthrow(e);" + NL + "\t\t";
  protected final String TEXT_196 = "   " + NL + "\t\t\t";
  protected final String TEXT_197 = " - There isContinue_";
  protected final String TEXT_198 = " an exception on: \" + ";
  protected final String TEXT_199 = NL + "\t\t\tSystem.err.println(\"There isContinue_";
  protected final String TEXT_200 = ");" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t\tSystem.out.println(\"\\r\\n\");" + NL + "\t\t\tisContinue_";
  protected final String TEXT_201 = " = false;" + NL + "\t\t";
  protected final String TEXT_202 = NL + "\t}";
  protected final String TEXT_203 = NL + "\tfinally {" + NL + "        org.apache.commons.httpclient.Cookie[] cookies_";
  protected final String TEXT_204 = ".getState().getCookies();" + NL + "        java.io.File cookieFile_";
  protected final String TEXT_205 = " = new java.io.File(";
  protected final String TEXT_206 = ");" + NL + "        java.io.File cookieDir_";
  protected final String TEXT_207 = "= cookieFile_";
  protected final String TEXT_208 = ".getParentFile();" + NL + "        if(!cookieDir_";
  protected final String TEXT_209 = ".exists()){" + NL + "        \tcookieDir_";
  protected final String TEXT_210 = ".mkdirs();" + NL + "        }" + NL + "        java.io.FileOutputStream fos_";
  protected final String TEXT_211 = " = new java.io.FileOutputStream(cookieFile_";
  protected final String TEXT_212 = ");" + NL + "        java.io.ObjectOutputStream os_";
  protected final String TEXT_213 = " = new java.io.ObjectOutputStream(fos_";
  protected final String TEXT_214 = ");" + NL + "" + NL + "        for (org.apache.commons.httpclient.Cookie c : cookies_";
  protected final String TEXT_215 = ") {" + NL + "            os_";
  protected final String TEXT_216 = ".writeObject(c);" + NL + "        }" + NL + "        os_";
  protected final String TEXT_217 = ".close();" + NL + "        fos_";
  protected final String TEXT_218 = ".close();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_219 = NL + NL + "\tif (isContinue_";
  protected final String TEXT_220 = ") {    " + NL + "\t\t";
  protected final String TEXT_221 = NL + "\t\t\tSystem.out.println(\"Status Line: \" + method_";
  protected final String TEXT_222 = ".getStatusLine());  " + NL + "\t\t\tSystem.out.println(\"*** Response Header ***\");  " + NL + "\t\t\torg.apache.commons.httpclient.Header[] responseHeaders_";
  protected final String TEXT_223 = ".getResponseHeaders();  " + NL + "" + NL + "\t\t\tfor (int i = 0; i < responseHeaders_";
  protected final String TEXT_224 = ".length; i++) {" + NL + "\t\t\t\tSystem.out.print(responseHeaders_";
  protected final String TEXT_225 = "[i]);" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_226 = NL + "\t\t\tretIS_";
  protected final String TEXT_227 = ".getResponseBodyAsStream();" + NL + "\t\t";
  protected final String TEXT_228 = NL + "\t\t\tjava.io.InputStream in_";
  protected final String TEXT_229 = ".getResponseBodyAsStream();" + NL + "\t\t\tString sDir_";
  protected final String TEXT_230 = " = (";
  protected final String TEXT_231 = ").trim();" + NL + "\t\t\tString fileName_";
  protected final String TEXT_232 = ").trim();    " + NL + "\t\t\t//open directory" + NL + "\t\t\tjava.net.URL url_";
  protected final String TEXT_233 = " = new java.net.URL(finalURL_";
  protected final String TEXT_234 = ");" + NL + "\t\t\tString sURIPath_";
  protected final String TEXT_235 = " = \"\";" + NL + "\t\t\tint iLastSlashIndex_";
  protected final String TEXT_236 = " = 0;" + NL + "\t\t\tsURIPath_";
  protected final String TEXT_237 = " = url_";
  protected final String TEXT_238 = ".getFile();" + NL + "\t\t\tiLastSlashIndex_";
  protected final String TEXT_239 = " = sURIPath_";
  protected final String TEXT_240 = ".lastIndexOf(\"/\");" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_241 = NL + "\t\t\t\tsDir_";
  protected final String TEXT_242 = " = sDir_";
  protected final String TEXT_243 = ".concat(iLastSlashIndex_";
  protected final String TEXT_244 = " > 0 ? sURIPath_";
  protected final String TEXT_245 = ".substring(0, iLastSlashIndex_";
  protected final String TEXT_246 = ") : \"\");" + NL + "\t\t\t";
  protected final String TEXT_247 = NL + NL + "\t\t\t// if not input file name, get the name from URI" + NL + "\t\t\tif (\"\".equals(fileName_";
  protected final String TEXT_248 = ")) {      " + NL + "\t\t\t\tif (iLastSlashIndex_";
  protected final String TEXT_249 = " > 0 && (!sURIPath_";
  protected final String TEXT_250 = ".endsWith(\"/\"))) {" + NL + "\t\t\t\t\tfileName_";
  protected final String TEXT_251 = ".substring(iLastSlashIndex_";
  protected final String TEXT_252 = " + 1);" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tfileName_";
  protected final String TEXT_253 = " = \"defaultfilename.txt\";" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tjava.io.File dir_";
  protected final String TEXT_254 = " = new java.io.File(sDir_";
  protected final String TEXT_255 = ");" + NL + "" + NL + "\t\t\t// pretreatment" + NL + "\t\t\ttry {" + NL + "\t\t\t\tjava.io.File test_file_";
  protected final String TEXT_256 = " = new java.io.File(dir_";
  protected final String TEXT_257 = ", fileName_";
  protected final String TEXT_258 = ");" + NL + "\t\t\t\ttest_file_";
  protected final String TEXT_259 = ".getParentFile().mkdirs();" + NL + "" + NL + "\t\t\t\tif (test_file_";
  protected final String TEXT_260 = ".createNewFile()) {" + NL + "\t\t\t\t\ttest_file_";
  protected final String TEXT_261 = ".delete();" + NL + "\t\t\t\t}" + NL + "\t\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t\t";
  protected final String TEXT_262 = NL + "\t\t\t\t\tlog.warn(\"";
  protected final String TEXT_263 = " - \" + e.getMessage());" + NL + "\t\t\t\t";
  protected final String TEXT_264 = NL + "\t\t\t\tfileName_";
  protected final String TEXT_265 = " = \"defaultfilename.txt\";" + NL + "\t\t\t}" + NL + "\t\t\tjava.io.File file_";
  protected final String TEXT_266 = ");" + NL + "\t\t\tfile_";
  protected final String TEXT_267 = ".getParentFile().mkdirs();    " + NL + "\t\t\tjava.io.FileOutputStream out_";
  protected final String TEXT_268 = " = new java.io.FileOutputStream(file_";
  protected final String TEXT_269 = ");" + NL + "\t\t\tbyte[] buffer_";
  protected final String TEXT_270 = " = new byte[1024];" + NL + "\t\t\tint count_";
  protected final String TEXT_271 = " = 0;" + NL + "" + NL + "\t\t\twhile ((count_";
  protected final String TEXT_272 = " = in_";
  protected final String TEXT_273 = ".read(buffer_";
  protected final String TEXT_274 = ")) > 0) {" + NL + "\t\t\t\tout_";
  protected final String TEXT_275 = ".write(buffer_";
  protected final String TEXT_276 = ", 0, count_";
  protected final String TEXT_277 = ");" + NL + "\t\t\t}" + NL + "\t\t\t// close opened object" + NL + "\t\t\tin_";
  protected final String TEXT_278 = ".close();   " + NL + "\t\t\tout_";
  protected final String TEXT_279 = ".close(); " + NL + "\t\t\t";
  protected final String TEXT_280 = NL + "\t\t\t\tlog.info(\"";
  protected final String TEXT_281 = " - Closing the connection to the server.\");" + NL + "\t\t\t";
  protected final String TEXT_282 = ".releaseConnection();" + NL + "\t\t\t";
  protected final String TEXT_283 = " - Connection to the server closed.\");" + NL + "\t\t\t";
  protected final String TEXT_284 = "   " + NL + "\t\t";
  protected final String TEXT_285 = "    " + NL + "\t} // B_01";
  protected final String TEXT_286 = NL + "\t\tjava.util.Properties props = System.getProperties();" + NL + "\t\tprops.put(\"socksProxyPort\", ";
  protected final String TEXT_287 = ");" + NL + "\t\tprops.put(\"socksProxyHost\", ";
  protected final String TEXT_288 = ");" + NL + "\t\tprops.put(\"java.net.socks.username\", ";
  protected final String TEXT_289 = ");" + NL + "\t        " + NL + "\t\t";
  protected final String TEXT_290 = NL + "\t   \t" + NL + "\t\tprops.put(\"java.net.socks.password\", decryptedPassword_";
  protected final String TEXT_291 = ");        " + NL + "\t";
  protected final String TEXT_292 = NL + "\t//open url stream" + NL + "\tjava.net.URL url_";
  protected final String TEXT_293 = ");    " + NL + "\t";
  protected final String TEXT_294 = NL + "\tjava.net.URLConnection conn_";
  protected final String TEXT_295 = ".openConnection();" + NL + "\t";
  protected final String TEXT_296 = NL + NL + "\t";
  protected final String TEXT_297 = NL + "\t\tretIS_";
  protected final String TEXT_298 = " = conn_";
  protected final String TEXT_299 = ".getInputStream();" + NL + "\t";
  protected final String TEXT_300 = NL + "\t\tjava.io.DataInputStream in_";
  protected final String TEXT_301 = " = null;" + NL + "\t\tString sDir_";
  protected final String TEXT_302 = ").trim();" + NL + "\t\tString fileName_";
  protected final String TEXT_303 = ").trim();" + NL + "" + NL + "\t\tString sURIPath_";
  protected final String TEXT_304 = " = \"\";" + NL + "\t\tint iLastSlashIndex_";
  protected final String TEXT_305 = " = 0;" + NL + "\t\tsURIPath_";
  protected final String TEXT_306 = ".getFile();" + NL + "\t\tiLastSlashIndex_";
  protected final String TEXT_307 = ".lastIndexOf(\"/\");" + NL + "" + NL + "\t\t";
  protected final String TEXT_308 = NL + "\t\t\tsDir_";
  protected final String TEXT_309 = ") : \"\");" + NL + "\t\t";
  protected final String TEXT_310 = NL + NL + "\t\t//if not input file name, get the name from URI" + NL + "\t\tif (\"\".equals(fileName_";
  protected final String TEXT_311 = ")) {      " + NL + "\t\t\tif (iLastSlashIndex_";
  protected final String TEXT_312 = ".endsWith(\"/\"))) {" + NL + "\t\t\t\tfileName_";
  protected final String TEXT_313 = " + 1);" + NL + "\t\t\t} else {" + NL + "\t\t\t\tfileName_";
  protected final String TEXT_314 = " = \"defaultfilename.txt\";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tjava.io.File dir_";
  protected final String TEXT_315 = ");" + NL + "" + NL + "\t\ttry {" + NL + "\t\t\tjava.io.File testfile_";
  protected final String TEXT_316 = " - Creating directory '\" + testfile_";
  protected final String TEXT_317 = ".getParentFile().getCanonicalPath());" + NL + "\t\t\t";
  protected final String TEXT_318 = NL + "\t\t\ttestfile_";
  protected final String TEXT_319 = ".getParentFile().mkdirs();" + NL + "\t\t\t";
  protected final String TEXT_320 = " - Create directory '\" + testfile_";
  protected final String TEXT_321 = ".getParentFile().getCanonicalPath()+ \"' has succeeded.\");" + NL + "\t\t\t";
  protected final String TEXT_322 = NL + NL + "\t\t\tif (testfile_";
  protected final String TEXT_323 = ".createNewFile()) {" + NL + "\t\t\t\ttestfile_";
  protected final String TEXT_324 = ".delete();" + NL + "\t\t\t}" + NL + "\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t";
  protected final String TEXT_325 = NL + "\t\t\t\tlog.warn(\"";
  protected final String TEXT_326 = NL + "\t\t\tfileName_";
  protected final String TEXT_327 = " = \"defaultfilename.txt\";" + NL + "\t\t}" + NL + "" + NL + "\t\t// copy file" + NL + "\t\ttry {" + NL + "\t\t\tin_";
  protected final String TEXT_328 = " = new java.io.DataInputStream(conn_";
  protected final String TEXT_329 = ".getInputStream());" + NL + "\t\t} catch(java.lang.Exception e) {" + NL + "\t\t\t";
  protected final String TEXT_330 = "    " + NL + "\t\t\t\tthrow(e);" + NL + "\t\t\t";
  protected final String TEXT_331 = NL + "\t\t\t\t";
  protected final String TEXT_332 = NL + "\t\t\t\t\tlog.error(\"";
  protected final String TEXT_333 = " - There is an exception on: \" + ";
  protected final String TEXT_334 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_335 = NL + "\t\t\t\tSystem.err.println(\"There is an exception on: \" + ";
  protected final String TEXT_336 = ");" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t\tSystem.out.println(\"\\r\\n\");" + NL + "\t\t\t\tin_";
  protected final String TEXT_337 = " = null;      " + NL + "\t\t\t";
  protected final String TEXT_338 = NL + "\t\t}  " + NL + "\t\tfinal java.io.DataOutputStream out_";
  protected final String TEXT_339 = "= new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(dir_";
  protected final String TEXT_340 = ")));" + NL + "" + NL + "\t\tif (in_";
  protected final String TEXT_341 = " != null) {" + NL + "\t\t\tbyte[] buffer_";
  protected final String TEXT_342 = ");" + NL + "\t\t\t}    " + NL + "\t\t\tin_";
  protected final String TEXT_343 = ".close();" + NL + "\t\t}    " + NL + "\t\tout_";
  protected final String TEXT_344 = ".close();" + NL + "\t";
  protected final String TEXT_345 = "     " + NL + "\tString srcurl_";
  protected final String TEXT_346 = ";" + NL + "\tString fileName_";
  protected final String TEXT_347 = ";" + NL + "\tString username_";
  protected final String TEXT_348 = ";" + NL + "\t        " + NL + "\t";
  protected final String TEXT_349 = NL + "\t" + NL + "\t";
  protected final String TEXT_350 = NL + "   \t" + NL + "\tString password_";
  protected final String TEXT_351 = " = decryptedPassword_";
  protected final String TEXT_352 = ";" + NL + "" + NL + "\tif (fileName_";
  protected final String TEXT_353 = ".compareTo(\"\") == 0) {" + NL + "\t\tfileName_";
  protected final String TEXT_354 = " = srcurl_";
  protected final String TEXT_355 = ".substring(srcurl_";
  protected final String TEXT_356 = ".lastIndexOf(\"/\"));" + NL + "\t}" + NL + "\t" + NL + "\tif (username_";
  protected final String TEXT_357 = ".compareTo(\"\") == 0) {" + NL + "\t\tusername_";
  protected final String TEXT_358 = " = null;" + NL + "\t}" + NL + "\t" + NL + "\tif (password_";
  protected final String TEXT_359 = ".compareTo(\"\") == 0) {" + NL + "\t\tpassword_";
  protected final String TEXT_360 = " = null;" + NL + "\t}" + NL + "\t" + NL + "\ttry {        " + NL + "\t\tjcifs.smb.NtlmPasswordAuthentication auth_";
  protected final String TEXT_361 = " = new jcifs.smb.NtlmPasswordAuthentication(";
  protected final String TEXT_362 = ", username_";
  protected final String TEXT_363 = ", password_";
  protected final String TEXT_364 = ");" + NL + "\t\tjcifs.smb.SmbFile sf_";
  protected final String TEXT_365 = " = new jcifs.smb.SmbFile(srcurl_";
  protected final String TEXT_366 = ", auth_";
  protected final String TEXT_367 = ");" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_368 = " = new jcifs.smb.SmbFileInputStream(sf_";
  protected final String TEXT_369 = NL + "\t\t\tjcifs.smb.SmbFileInputStream in_";
  protected final String TEXT_370 = ");" + NL + "\t\t\tjava.io.File destFile_";
  protected final String TEXT_371 = ");" + NL + "\t\t\tdestFile_";
  protected final String TEXT_372 = ".getParentFile().mkdirs();" + NL + "\t\t\tjava.io.OutputStream out_";
  protected final String TEXT_373 = " = new java.io.FileOutputStream(destFile_";
  protected final String TEXT_374 = ");" + NL + "\t\t\tbyte[] buf_";
  protected final String TEXT_375 = " = new byte[1024];" + NL + "\t\t\tint len_";
  protected final String TEXT_376 = ";" + NL + "\t" + NL + "\t\t\twhile ((len_";
  protected final String TEXT_377 = ".read(buf_";
  protected final String TEXT_378 = ".write(buf_";
  protected final String TEXT_379 = ", 0, len_";
  protected final String TEXT_380 = ");" + NL + "\t\t\t}" + NL + "\t\t\tin_";
  protected final String TEXT_381 = ".close();" + NL + "\t\t\tout_";
  protected final String TEXT_382 = ".close();" + NL + "\t\t\t} catch (java.io.FileNotFoundException ex) {" + NL + "\t\t\t\t";
  protected final String TEXT_383 = " - \" + ex.getMessage());" + NL + "\t\t\t\t";
  protected final String TEXT_384 = NL + "\t\t\t\tSystem.err.println(ex.getMessage());" + NL + "\t\t";
  protected final String TEXT_385 = " " + NL + "\t} catch (java.lang.Exception e) {" + NL + "\t\t";
  protected final String TEXT_386 = " - \" + e.getMessage());" + NL + "\t\t";
  protected final String TEXT_387 = NL + "\t\tSystem.err.println(e.getMessage());" + NL + "\t}";
  protected final String TEXT_388 = NL + "\tjava.io.InputStream stream";
  protected final String TEXT_389 = " = (java.io.InputStream)globalMap.get(\"";
  protected final String TEXT_390 = "_INPUT_STREAM\");" + NL + "\tif(stream";
  protected final String TEXT_391 = "!=null){" + NL + "\t\tstream";
  protected final String TEXT_392 = ".close();" + NL + "\t}";
  protected final String TEXT_393 = NL + "globalMap.put(\"";
  protected final String TEXT_394 = "_INPUT_STREAM\", retIS_";
  protected final String TEXT_395 = NL;

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
	
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
String cid = node.getUniqueName();
String protocol = ElementParameterParser.getValue(node, "__PROTO__");
String directory = ElementParameterParser.getValue(node, "__DIRECTORY__");
String filename = ElementParameterParser.getValue(node, "__FILENAME__");
boolean bMakeDirs = "true".equals(ElementParameterParser.getValue(node, "__MAKEDIRS__"));
boolean bUseCache = "true".equals(ElementParameterParser.getValue(node, "__USE_CACHE__"));
boolean bDieOnError = "true".equals(ElementParameterParser.getValue(node, "__DIE_ON_ERROR__"));

    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_19);
    
if ("http".equals(protocol) || "https".equals(protocol)) {
	String uri = ElementParameterParser.getValue(node, "__URI__");
	String username = ElementParameterParser.getValue(node, "__AUTH_USERNAME__");
	String timeout = ElementParameterParser.getValue(node, "__TIMEOUT__");
	String cookieDir = ElementParameterParser.getValue(node, "__COOKIE_DIR__");
	String cookiePolicy = ElementParameterParser.getValue(node,"__COOKIE_POLICY__");
	boolean singleCookie = "true".equals(ElementParameterParser.getValue(node, "__SINGLE_COOKIE__"));
	String proxyHost = ElementParameterParser.getValue(node, "__PROXY_HOST__");
	String proxyPort = ElementParameterParser.getValue(node, "__PROXY_PORT__");
	String proxyUser = ElementParameterParser.getValue(node, "__PROXY_USERNAME__");
	String proxyDomain = ElementParameterParser.getValue(node, "__PROXY_DOMAIN__");
	boolean post = "true".equals(ElementParameterParser.getValue(node, "__POST__"));
	boolean printResponse = "true".equals(ElementParameterParser.getValue(node, "__PRINT__"));
	boolean uploadFile = "true".equals(ElementParameterParser.getValue(node,"__UPLOAD__"));
	boolean needAuth = "true".equals(ElementParameterParser.getValue(node, "__NEED_AUTH__"));
	boolean saveCookie = "true".equals(ElementParameterParser.getValue(node, "__SAVE_COOKIE__"));
	boolean readCookie = "true".equals(ElementParameterParser.getValue(node, "__READ_COOKIE__"));
	boolean redirect = "true".equals(ElementParameterParser.getValue(node, "__REDIRECT__"));
	boolean redirect_302_as_303 = "true".equals(ElementParameterParser.getValue(node, "__REDIRECT_302_AS_303__"));
	boolean useProxy = "true".equals(ElementParameterParser.getValue(node, "__USE_PROXY__"));
	boolean useProxyNTLM = "true".equals(ElementParameterParser.getValue(node, "__PROXY_NTLM__"));
	boolean addHeader = "true".equals(ElementParameterParser.getValue(node, "__ADD_HEADER__"));
	boolean encodeURI = "true".equals(ElementParameterParser.getValue(node, "__ENCODE_URI__"));

	String scaccepted_uploadfile = ((uploadFile) ? " || status_"+cid+" == org.apache.commons.httpclient.HttpStatus.SC_ACCEPTED": "");

    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
		if (encodeURI) {

    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_32);
    
		} else {

    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_34);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_35);
    
		}

    stringBuffer.append(TEXT_36);
    
		String unsupportedEncodingErrorMessage = "URI is not correct or not encoded, please input a valid one or use 'Encode URI' option";
		if (isLog4jEnabled) {

    stringBuffer.append(TEXT_37);
    stringBuffer.append(unsupportedEncodingErrorMessage );
    stringBuffer.append(TEXT_38);
    
		} else {

    stringBuffer.append(TEXT_39);
    stringBuffer.append( unsupportedEncodingErrorMessage );
    stringBuffer.append(TEXT_40);
    
		}

    stringBuffer.append(TEXT_41);
    
	if ("https".equals(protocol)) {
	
    stringBuffer.append(TEXT_42);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_43);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_46);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_35);
    
	}

    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_56);
    stringBuffer.append(timeout );
    stringBuffer.append(TEXT_54);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cookiePolicy );
    stringBuffer.append(TEXT_54);
    if(singleCookie){
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_60);
    }
    stringBuffer.append(TEXT_61);
    if (readCookie) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(cookieDir);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_79);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    }
    stringBuffer.append(TEXT_82);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    }
    stringBuffer.append(TEXT_84);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_92);
    
	}

	if (useProxy) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(proxyPort);
    stringBuffer.append(TEXT_96);
    
		String passwordFieldName = "__PROXY_PASSWORD__";
		
    stringBuffer.append(TEXT_97);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_35);
    } else {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    if (useProxyNTLM) {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_105);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(proxyPort);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(proxyUser );
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_108);
    stringBuffer.append(proxyDomain );
    stringBuffer.append(TEXT_109);
    } else {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(proxyPort);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(proxyUser );
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_113);
    }
	}

	if (needAuth) {
		if (ElementParameterParser.canEncrypt(node, "__AUTH_PASSWORD__")) {
		
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, "__AUTH_PASSWORD__"));
    stringBuffer.append(TEXT_115);
    
		} else {
		
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    stringBuffer.append( ElementParameterParser.getValue(node, "__AUTH_PASSWORD__"));
    stringBuffer.append(TEXT_116);
    
		}
		
		if ((!useProxy) && useProxyNTLM && (!"".equals(proxyDomain))) {
		
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_117);
    stringBuffer.append(username );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_119);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_120);
    stringBuffer.append(proxyDomain);
    stringBuffer.append(TEXT_113);
    } else {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    stringBuffer.append(username );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_113);
    }
	}

	if (post) {
	
    stringBuffer.append(TEXT_122);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
     if (encodeURI) { 
    stringBuffer.append(TEXT_124);
     } else {
    stringBuffer.append(TEXT_125);
     } 
    stringBuffer.append(TEXT_115);
    
		List<Map<String, String>> commonParams = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__COMMON_PARAMS__");	
		List<String> varPartList = new ArrayList<String>();	//common string parameter part	
		int i = 0;

		for (Map<String, String> param : commonParams) {
			i++;
			String name = param.get("COMMON_PARAMS_NAME");
			String value = param.get("COMMON_PARAMS_VALUE");
			varPartList.add("common_" + i + "_" + cid);
			
    stringBuffer.append(TEXT_126);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(name );
    stringBuffer.append(TEXT_108);
    stringBuffer.append(value );
    stringBuffer.append(TEXT_129);
    
		}

		if (uploadFile) {
			List<Map<String, String>> fileParams = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__FILE_PARAMS__");
			int j = 0;

			for (Map<String, String> param : fileParams) {
				j++;
				String name = param.get("FILE_PARAMS_NAME");
				String value = param.get("FILE_PARAMS_VALUE");
				String content_type = param.get("FILE_PARAMS_CONTENT_TYPE");
				String charset = param.get("FILE_PARAMS_CHARSET");
				varPartList.add("file_" + j + "_" + cid);
				
    stringBuffer.append(TEXT_130);
    stringBuffer.append(j);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_131);
    stringBuffer.append(name );
    stringBuffer.append(TEXT_132);
    stringBuffer.append(value );
    stringBuffer.append(TEXT_133);
    stringBuffer.append(content_type);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(charset);
    stringBuffer.append(TEXT_129);
    
			}
		}
		
    stringBuffer.append(TEXT_134);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_135);
    for(String var: varPartList){
    stringBuffer.append(var );
    stringBuffer.append(TEXT_136);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_140);
    } else {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_141);
    stringBuffer.append(cid );
     if (encodeURI) { 
    stringBuffer.append(TEXT_124);
     } else {
    stringBuffer.append(TEXT_125);
     } 
    stringBuffer.append(TEXT_54);
    }

	if (addHeader) {
		List<Map<String, String>> headers = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__HEADERS__");
		
		for (Map<String, String> header : headers) {
		
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(header.get("HEADER_NAME"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(header.get("HEADER_VALUE"));
    stringBuffer.append(TEXT_115);
    
		}
	}
	
    stringBuffer.append(TEXT_144);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_147);
    stringBuffer.append(cid );
     if (encodeURI) { 
    stringBuffer.append(TEXT_124);
     } else {
    stringBuffer.append(TEXT_125);
     } 
    stringBuffer.append(TEXT_148);
    if (redirect) { //Bug13155, add support of redirection
    stringBuffer.append(TEXT_149);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_157);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_158);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_159);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_162);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_159);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_163);
    }
    stringBuffer.append(TEXT_164);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_166);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_167);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_170);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_172);
     if(redirect_302_as_303) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_174);
     } 
    stringBuffer.append(TEXT_175);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_177);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_178);
    if(post){
    stringBuffer.append(TEXT_179);
    }else{
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_181);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_182);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_184);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_185);
    stringBuffer.append( scaccepted_uploadfile);
    stringBuffer.append(TEXT_186);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_187);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_188);
    } else {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_190);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_115);
    
		}

		if (!redirect) {
		
    stringBuffer.append(TEXT_191);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_185);
    stringBuffer.append( scaccepted_uploadfile);
    stringBuffer.append(TEXT_192);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_193);
    
		}
		
    stringBuffer.append(TEXT_194);
    if (bDieOnError) {
    stringBuffer.append(TEXT_195);
    } else {
    stringBuffer.append(TEXT_196);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_197);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_129);
    }
    stringBuffer.append(TEXT_199);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_200);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
     if(saveCookie){ 
    stringBuffer.append(TEXT_203);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_204);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(cookieDir);
    stringBuffer.append(TEXT_206);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_207);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_208);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_209);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_210);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_211);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_212);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_213);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_214);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_215);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_216);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_217);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_218);
     } 
    stringBuffer.append(TEXT_219);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_220);
    if (printResponse) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_224);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_225);
    
		}

		if (bUseCache) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_227);
    } else {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(directory);
    stringBuffer.append(TEXT_231);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_230);
    stringBuffer.append(filename);
    stringBuffer.append(TEXT_232);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_233);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_234);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_235);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_236);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_237);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_238);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_239);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_240);
    if (bMakeDirs) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_242);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_243);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_245);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_246);
    }
    stringBuffer.append(TEXT_247);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_248);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_249);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_250);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_239);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_251);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_252);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_253);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_254);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_256);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_258);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_259);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_260);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_261);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_262);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_265);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_256);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_266);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_267);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_268);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_269);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_270);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_271);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_272);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_273);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_274);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_275);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_276);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_277);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_278);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_279);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_280);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_281);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_282);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_280);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    
} else if (("ftp").equals(protocol)) {
	String uri = ElementParameterParser.getValue(node, "__URI__");
	boolean useProxy = ("true").equals(ElementParameterParser.getValue(node,"__USE_PROXY__"));
	String proxyHost = ElementParameterParser.getValue(node,"__PROXY_HOST__");
	String proxyPort = ElementParameterParser.getValue(node,"__PROXY_PORT__");
	String proxyUser = ElementParameterParser.getValue(node,"__PROXY_USERNAME__");

	//The following part support the socks proxy for FTP and SFTP (Socks V4 or V5, they are all OK). 
	//And it can not work with the FTP proxy directly, only support the socks proxy.
	if (useProxy) {
	
    stringBuffer.append(TEXT_286);
    stringBuffer.append(proxyPort );
    stringBuffer.append(TEXT_287);
    stringBuffer.append(proxyHost );
    stringBuffer.append(TEXT_288);
    stringBuffer.append(proxyUser );
    stringBuffer.append(TEXT_289);
    
		String passwordFieldName = "__PROXY_PASSWORD__";
		
    stringBuffer.append(TEXT_97);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_35);
    } else {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_291);
     }
    stringBuffer.append(TEXT_292);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_293);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_237);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_295);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_296);
    if (bUseCache) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_298);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_299);
    } else {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_301);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(directory);
    stringBuffer.append(TEXT_302);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_230);
    stringBuffer.append(filename);
    stringBuffer.append(TEXT_303);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_304);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_305);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_237);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_306);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_239);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_307);
    if (bMakeDirs) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_242);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_243);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_245);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_309);
    }
    stringBuffer.append(TEXT_310);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_311);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_249);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_312);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_239);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_251);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_313);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_314);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_254);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_315);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_256);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_129);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_280);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_316);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_319);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_280);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_320);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_322);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_323);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_324);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_325);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    }
    stringBuffer.append(TEXT_326);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_327);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_328);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_329);
     if (bDieOnError) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_332);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_333);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_334);
    }
    stringBuffer.append(TEXT_335);
    stringBuffer.append(uri );
    stringBuffer.append(TEXT_336);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_337);
    }
    stringBuffer.append(TEXT_338);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_339);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_340);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_341);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_270);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_271);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_272);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_273);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_274);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_275);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_276);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_342);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_343);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_344);
    
	}
} else if ("smb".equals(protocol)) {
	String srcurl = ElementParameterParser.getValue(node, "__SMB_URI__"); 
	String domain = ElementParameterParser.getValue(node,"__SMB_DOMAIN__");
	String username = ElementParameterParser.getValue(node,"__SMB_USERNAME__");
	
    stringBuffer.append(TEXT_345);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_101);
    stringBuffer.append(srcurl );
    stringBuffer.append(TEXT_346);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_101);
    stringBuffer.append(filename );
    stringBuffer.append(TEXT_347);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_101);
    stringBuffer.append(username );
    stringBuffer.append(TEXT_348);
    
	String passwordFieldName = "__SMB_PASSWORD__";
	
    stringBuffer.append(TEXT_349);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_35);
    } else {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_350);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_351);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_352);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_353);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_354);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_355);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_356);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_357);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_358);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_359);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_360);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_361);
    stringBuffer.append(domain );
    stringBuffer.append(TEXT_362);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_363);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_364);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_365);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_366);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_367);
    if (bUseCache) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_368);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_115);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_368);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_370);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(directory );
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_371);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_372);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_373);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_374);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_375);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_376);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_272);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_377);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_274);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_378);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_379);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_380);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_381);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_382);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_332);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_37);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_386);
    }
    stringBuffer.append(TEXT_387);
    }
    if (bUseCache) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_390);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_391);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_392);
    }
    stringBuffer.append(TEXT_393);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_394);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_395);
    return stringBuffer.toString();
  }
}
