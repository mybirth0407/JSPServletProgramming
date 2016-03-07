package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IncludeTestServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<font color=red><h3>" +
            "InlcludeTestServlet2의 수행 결과</h3></font>");
        out.println("javax.servlet.include.request_uri: " +
            req.getAttribute("javax.servlet.include.request_uri"));
        out.println("<br>");
        out.println("javax.servlet.include.context_path: " +
            req.getAttribute("javax.serlvet.include.context_path"));
        out.println("<br>");
        out.println("javax.servlet.include.servlet_path: " +
            req.getAttribute("javax.servlet.include.servlet_path"));
        out.println("<br>");
    }
}
