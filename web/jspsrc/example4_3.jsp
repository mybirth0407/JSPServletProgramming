<%--
  Created by IntelliJ IDEA.
  User: Yedarm Seong
  Date: 2016-01-12
  Time: 오후 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> 내장객체 예제 </title>
</head>
<body>
<h3>out 활용 예제</h3>
<%
  int total = out.getBufferSize();
  out.print("이 부분은 출력되지 않을 것입니다.");
  out.clearBuffer();
  out.print("출력 버퍼의 크기: " + total + "<br>");
  out.print("사용되지 않은 버퍼의 크기: " + out.getRemaining() + "<br>");
  out.flush();
  out.print("flush 후 사용되지 않은 버퍼의 크기: " + out.getRemaining());
%>
<hr>
<h5> 오버 로딩된 println 살펴보기 </h5>
<pre>
  <%
    out.println(100);
    out.println(true);
    out.println(3.14);
    out.println("TEST");
    out.println("가");
    out.println(new java.io.File("\\"));
    out.print("사용되지 않은 버퍼의 크기: " + out.getRemaining());
  %>
</pre>
</body>
</html>
