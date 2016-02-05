<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-13
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> PLUGIN 액션 태그 JSP 예제 </title>
</head>
<body>
<h1> Applet의 수행 결과 </h1>
<hr>
<jsp:plugin type="applet" codebase="appletsrc" code="Blink"
            height="200" width="200" >
  <jsp:params>
    <jsp:param name="lbl"
               value="Java JSP Servlet EJB JDBC RMI AWT JavaBeans Custom Tag" />
    <jsp:param name="speed" value="4" />
  </jsp:params>
  <jsp:fallback> Java Plugin Error !! </jsp:fallback>
</jsp:plugin>
</body>
</html>
