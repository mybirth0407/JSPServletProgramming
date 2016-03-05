<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> 객체공유 </title>
</head>
<body>
<h4> 객체 공유 점검 예제 1 - application </h4>
<jsp:useBean id="objapp" scope="application" class="jsp.beans.CountBean" />
현재까지 누적된 값: <br>
<jsp:getProperty name="objapp" property="count" /> <br>
<hr>
1 추가 ==> <br>
<jsp:setProperty name="objapp" property="count" value="1" />
<hr>
결과값:
<jsp:getProperty name="objapp" property="count" /> <br>
</body>
</html>
