<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>example1</title>
</head>
<body>
<% String user = request.getParameter("name");
  if (user == null) user = "Guest"; %>
<center>
  <h1>Hello <%=user%></h1>
</center>
</body>
</html>
