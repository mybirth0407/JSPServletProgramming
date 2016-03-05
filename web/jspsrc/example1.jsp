<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<% String user = request.getParameter("name");
  if (user == null) user = "Guest"; %>
<center>
  <h1>Hello <%=user%></h1>
</center>
</body>
</html>
