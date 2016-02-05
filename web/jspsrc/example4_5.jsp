<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오후 6:58
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> 내장객체 활용 예제 </title>
</head>
<body>
<h3> application 활용 예제 </h3>
<h4> 서버에 대한 정보 </h4>
서버 명: <%= application.getServerInfo() %> <br>
지원되는 Servlet API 버전: <%= application.getMajorVersion() %>
<%= application.getMinorVersion() %> <br>
<h4> Web Application 디렉토리의 파일 리스트 </h4>
<%
  java.util.Set list = application.getResourcePaths("/");
  if (list != null) {
    Object obj[] = list.toArray();

    for (int i = 0; i < obj.length; i++) {
      out.print(obj[i] + "<br>");
    }
  }
%>
</body>
</html>
