<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<html>
<head>
  <title> JspEngineInfo와 JspFactory 예제 </title>
</head>
<body>
<h3> JSPEngineInfo와 JSP Factory 예제 </h3>
<%
JspEngineInfo engineinfo = JspFactory.getDefaultFactory().getEngineInfo();
%>
<h4> JSP 컨테이너에 의해 지원되는 JSP 버전 : <%=
engineinfo.getSpecificationVersion() %></h4>
</body>
</html>
