<%-- dynamicdata.jsp?name=hi --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<center>
  <h1> Hello <%=request.getParameter("name")%> ! </h1>
</center>
</body>
</html>
