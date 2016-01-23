<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-13
  Time: 오후 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>include action을 이용한 Layout 예제</title>
</head>
<body>
<table width="600" border="1" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="2">
      <jsp:include page="top.jsp" />
    </td>
  </tr>
  <tr>
    <td width="200" valign="top" >
      <jsp:include page="left.jsp" />
    </td>
    <td width="400" valign="top" >
      여기가 각 페이지의 작업영역입니다.
      <br><br><br><br><br><br><br><br>
    </td>
  </tr>
  <tr>
    <td colspan="2">
      <jsp:include page="bottom.jsp" />
    </td>
  </tr>
</table>
</body>
</html>
