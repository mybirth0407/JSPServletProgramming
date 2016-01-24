<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-25
  Time: 오전 2:24
  To change this template use File | Settings | File Templates.
--%>

<%-- dynamicdata.jsp?name=hi --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<center>
  <h1> Hello <%=request.getParameter("name")%> ! </h1>
</center>
</body>
</html>
