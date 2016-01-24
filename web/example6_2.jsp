<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-24
  Time: 오후 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="nameTest" class="beans.HelloBean" />
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
  <jsp:setProperty name="nameTest" property="name" param="name" /> <br>
  <jsp:setProperty name="nameTest" property="number" param="number" /> <br>
  <hr>
  name 프로퍼티 값 설정 후: <jsp:getProperty name="nameTest"
                                     property="name"/> <br>
  number 프로퍼티 값 설정 전: <jsp:getProperty name="nameTest"
                                       property="number"/> <br>
  <hr>
</center>
</body>
</html>
