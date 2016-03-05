<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<% java.util.Date d = new java.util.Date(); // Date 객체를 생성한다. %>
<%= /* 날짜와 시간 정보를 Locale을 적용하여 출력 */
  d.toLocaleString() %>
입니다.
</body>
</html>
