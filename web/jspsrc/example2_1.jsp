<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 6:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import = "java.util.Calendar" %>
<%! String defaultUser = "Guest";
  public String getUser(String user) {
    return user == null ? defaultUser: user;
  } %>
<html>
<body>
<% String user = getUser(request.getParameter("name"));
  Calendar cal = Calendar.getInstance(); %>
<center>
  <h1> Hello <%= user%> ! 방문일자는 <%=cal.get(Calendar.MONTH) + 1 %> 월
  <%=cal.get(Calendar.DATE) %> 일 입니다. </h1>
</center>
</body>
</html>
