package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>forward 예제</title>");
        out.println("</head><body><font color=blue>" +
            "<h3>ForwardTestServlet2의 수행 결과</h3></font>");
        out.println("</body></html>");
        out.close();
    }
}
