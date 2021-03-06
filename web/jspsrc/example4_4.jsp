<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title> 내장객체 예제 </title>
</head>
<body>
<%
  if (request.getMethod().equals("POST")) {
    if (session.isNew() || session.getAttribute("member_id") == null) {
      String name = request.getParameter("id");
      String passwd = request.getParameter("passwd");
      session.setAttribute("member_id", name);
      session.setAttribute("member_passwd", passwd);
      session.setMaxInactiveInterval(60);
%>
회원 인증이 처리되었습니다. <br>
<%= session.getAttribute("member_id") %> 회원님!! <br>
<%
    }
    else {
%>
회원 인증을 수행하실 필요가 없습니다! <br>
회원 인증을 이미 수행하셨습니다. <br>
<%= session.getAttribute("member_id") %> 회원님!! <br>
<%
    }
  }
  else if (request.getMethod().equals("GET")) {
      if (session != null && session.getAttribute("member_id") != null) {
        session.invalidate();
        out.print("회원 인증이 해제되었습니다 !!");
      }
      else {
        out.print("현재 인증된 상태가 아닙니다 !!");
      }
    }
%>
</body>
</html>
