<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body bgcolor="white">
<h3> 요청 정보</h3>
<%
  response.setDateHeader("Expires", 0);
  response.setHeader("Progma", "no-cache");
  if (request.getProtocol().equals("HTTP/1.1")) {
    response.setHeader("Cache-Control", "no-cache");
  }
%>
<font size="4">
  JSP Request Method: <%= request.getMethod() %> <br>
  Request URI: <%= request.getRequestURI() %> <br>
  Request Protocol: <%= request.getProtocol() %> <br>
  Servlet path: <%= request.getServletPath() %> <br>
  Query string: <%= request.getQueryString() %> <br>
  Content length: <%= request.getContentLength() %> <br>
  Content type: <%= request.getContentType() %> <br>
  Server name: <%= request.getServerName() %> <br>
  Server port: <%= request.getServerName() %> <br>
  Remote address: <%= request.getRemoteAddr() %> <br>
  Remote host: <%= request.getRemoteHost() %> <br>
  <hr>
  The browser you are using is <%= request.getHeader("user-Agent") %>
</font>
</body>
<body>
</body>
</html>
