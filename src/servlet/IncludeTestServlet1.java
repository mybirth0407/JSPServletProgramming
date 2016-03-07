package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IncludeTestServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>include 예제1</title>");
        out.println("</head><body><h3>IncludeTestServlet1의 수행 결과</h3>");
        out.println("</body></html>");
        ServletContext context = getServletContext();
        RequestDispatcher rd = context.getRequestDispatcher(
            "/servlet.IncludeTestServlet2");
        out.println("<hr>");
        rd.include(req, res);
        out.println("<hr>");
        rd.include(req, res);
        out.close();
    }
}
