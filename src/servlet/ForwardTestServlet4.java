package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet4 extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>forward 예제</title>");
        out.println("</head><body><font color=blue>" +
            "<h3>ForwardTestServlet4의 수행 결과</h3></font>");
        out.println("추출된 Account 객제 정보: ");
        Account obj = (Account)req.getAttribute("userinfo");

        if (obj != null) {
            out.println("이름: " + obj.getName() + " 번호: " +
                obj.getNumber() + "<br>");
        }
        else {
            out.println("<br>");
        }

        out.println("javax.servlet.forward.request_uri: " +
            req.getAttribute("javax.servlet.forward.request_uri"));
        out.println("<br>");
        out.println("javax.servlet.forward.context_path: " +
            req.getAttribute("javax.servlet.forward.context_path"));
        out.println("<br>");
        out.println("javax.servlet.forward.servlet_path: " +
            req.getAttribute("javax.servlet.forward.servlet_path"));
        out.println("<br>");
        out.println("</body></html>");
        out.close();
    }
}
