<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.util.Calendar" %>
<html>
<head>
  <title>example2_4</title>
</head>
<body>
<% Calendar cal = Calendar.getInstance(); %>
<center>
  <h1> Hello ${param.name == null ?  "Guest": param.name}! 방문 일자는
  <%=cal.get(Calendar.MONTH) + 1%> 월 <%=cal.get(Calendar.DATE) %>일 입니다.
  </h1>
</center>

</body>
</html>
