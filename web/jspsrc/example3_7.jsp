<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<center>
<%--  <h1> 스크립트릿으로 구구단을 외워보자. </h1>
  <% for (int i = 2; i < 10; i++) {
    for (int j = 1;  j < 10; j++) {
      out.println(i + " x " + j + " = " + i * j); %> <br>
  <%  } %>
  <% } %>--%>
  <h3> 표현식으로 구구단을 외워보자. </h3>
  <% for (int i = 2; i < 10; i++) {
    for (int j = 1;  j < 10; j++) { %>
      <%=i%> x <%=j%> = <%=i * j%> <br>
      <% }
}
%>
</center>
</body>
</html>
