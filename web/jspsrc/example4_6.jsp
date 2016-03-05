<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> 내장객체 활용 예제 </title>
</head>
<body>
<h1> pageContext 활용 예제 </h1>
<%!
  public void work(String s, PageContext pc) {
    try {
      JspWriter out = pc.getOut();

      if (s.equals("include")) {
        out.print("include 하기 전.. <br>");
        pc.include("test.jsp");
        out.print("include 한 다음.. <br>");
      }
      else if (s.equals("forward")) {
        pc.forward("test.jsp");
      }
      else {
        out.println("include나 forward를 입력해야 합니다.");
      }
    }
    catch (Exception e){
      System.out.println("오류 발생!");
    }
  }
%>
<%
  if (request.getMethod().equals("GET")) {
    String command = request.getParameter("comm");
    work(command, pageContext);
  }
  else {
    out.println("<h3> GET 방식으로 요청하셔야 합니다 !! </h3>");
  }
%>
</body>
</html>
