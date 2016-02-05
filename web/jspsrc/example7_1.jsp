<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-02-06
  Time: 오전 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<title> EL 내장객체 활용 예제</title>
<body>
<h3> EL 내장객체를 이용해서 표현식을 작성해보자 </h3>
<% request.setAttribute("title", "EL 표현식"); %>
<!-- pageContext.getRequest().getRequestURI() 와 같은 값을 출력한다. -->
요청 URI: ${pageContext.request.requestURI} <br/>
request의 title 속성의 값: ${requestScope.title} <br/>
<!-- 이름이 id인 요청 파라미터가 있다면 id의 값을 출력하고
      없다면 아무값도 출력하지 않는다. -->
만일 요청 파라미터 id가 있다면 id의 값: ${param.id} <br/>
</body>
</html>
