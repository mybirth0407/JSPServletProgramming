<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="nameTest" class="jsp.beans.HelloBean" />
<html>
<head>
  <title> HelloBean JavaBeans Test </title>
</head>
<body>
<center>
  <h1> HelloBean Name / Number Test </h1>
  name 프로퍼티 값 설정 전: <jsp:getProperty name="nameTest"
                                     property="name"/> <br>
  number 프로퍼티 값 설정 전: <jsp:getProperty name="nameTest"
                                       property="number"/> <br>
  <hr>
  =name, number 프로퍼티 설정 =
  <jsp:setProperty name="nameTest" property="name" value="Tester" /> <br>
  <jsp:setProperty name="nameTest" property="number" value="20160124" /> <br>
  <hr>
  name 프로퍼티 값 설정 후: <jsp:getProperty name="nameTest"
                                     property="name"/> <br>
  number 프로퍼티 값 설정 전: <jsp:getProperty name="nameTest"
                                       property="number"/> <br>
  <hr>
</center>
</body>
</html>
