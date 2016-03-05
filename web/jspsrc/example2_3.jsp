<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="hello" class="jsp.HelloBean" />
<jsp:setProperty name="hello" property="name" param="name" />
<html>
<body>
<center>
  <h1> Hello <jsp:getProperty name="hello" property="name" />! 방문일자는
  <jsp:getProperty name="hello" property="month" /> 월
  <jsp:getProperty name="hello" property="date" /> 일 입니다. </h1>
</center>
</body>
</html>
