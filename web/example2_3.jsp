<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 7:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="hello" class="hello.HelloBean" />
<jsp:setProperty name="hello" property="name" param="name" />
<html>
<head>
  <title>example2_3</title>
</head>
<body>
<center>
  <h1> Hello <jsp:getProperty name="hello" property="name" />! 방문 일자는
  <jsp:getProperty name="hello" property="month" /> 월
  <jsp:getProperty name="hello" property="date" /> 일 입니다. </h1>
</center>
</body>
</html>
