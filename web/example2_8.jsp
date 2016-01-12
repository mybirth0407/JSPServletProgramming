<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오전 7:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>example2_8</title>
</head>
<body>
<% java.util.Date d = new java.util.Date(); // Date 객체를 생성한다. %>
<%= /* 날짜와 시간 정보를 Locale을 적용하여 출력 */
  d.toLocaleString() %>
입니다.
</body>
</html>
