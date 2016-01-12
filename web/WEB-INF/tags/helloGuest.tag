<%@ tag body-content="empty" pageEncoding="utf-8" %>
<%@ tag import ="java.util.Calendar" %>
<% Calendar cal = Calendar.getInstance(); %>
<h1> Hello ${param.name == null ? "Guest": param.name}! 방문 일자는
<%=cal.get(Calendar.MONTH) + 1%> 월 <%=cal.get(Calendar.DATE )%> 일 입니다.
</h1>