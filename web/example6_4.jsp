<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-24
  Time: 오후 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> 객체공유 </title>
</head>
<body>
<h4> 객체 공유 점검 예제 2 - application </h4>
<jsp:useBean id="objapp" scope="application" class="beans.CountBean" />
현재까지 누적된 값: <br>
<jsp:getProperty name="objapp" property="count" /> <br>
<hr>
10 추가 ==> <br>
<jsp:setProperty name="objapp" property="count" value="10" />
<hr>
결과값:
<jsp:getProperty name="objapp" property="count" /> <br>
</body>
</html>
