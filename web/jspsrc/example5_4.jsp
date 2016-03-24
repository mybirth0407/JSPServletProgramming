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
               value="Java JSP Servlet EJB jdbc RMI AWT JavaBeans Custom Tag" />
    <jsp:param name="speed" value="4" />
  </jsp:params>
  <jsp:fallback> Java Plugin Error !! </jsp:fallback>
</jsp:plugin>
</body>
</html>
