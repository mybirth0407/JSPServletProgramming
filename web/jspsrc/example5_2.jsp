<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> forward 액션 태그를 이용한 분기 예제 </title>
</head>
<body>
<%
  if (request.getParameter("type") == null ||
    request.getParameter("type").equals("admin")) { %>
  <jsp:forward page="admin.jsp"/>
  <% }
  else { %>
  <jsp:forward page="user.jsp" />
  <% }
%>
</body>
</html>
