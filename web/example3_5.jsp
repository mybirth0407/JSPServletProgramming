<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="example3_4.jsp" %>
<% String param = request.getParameter("id");
  if (param.equals("test")) {
    param = "파라미터가 입력되었습니다. (예외 상황이 발생하지 않았습니다.)";
  }
%>
<html>
<head>
  <title>example3_5</title>
</head>
<body>
  <center>
    <h4> <%=param %></h4>
  </center>
</body>
</html>
