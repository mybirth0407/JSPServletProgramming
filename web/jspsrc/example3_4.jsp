<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<% response.setStatus(500); %>
<!-- This error page is for JSP errors. -->

<html>
<head><title> 예외상황 처리 </title></head>
<body>
<center>
  <HR size="1" noshade="noshade">
  <h4> 다음과 같은 에러가 발생하였습니다.</h4>
  <HR size="1" noshade="noshade">
  에러타입: <%=exception.getClass().getName() %> <br>
  에러메세지: <B><%=exception.getMessage() %></B>
</center>
</body>
</html>
