package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HeaderInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html;charset=UTF-8");
        out = res.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Request 정보 출력 servlet</TITLE></HEAD");
        out.println("<BODY>");
        out.println("<H3>요청 헤더 정보</H3>");
        out.println("<PRE>");

        Enumeration em = req.getHeaderNames();

        while (em.hasMoreElements()) {
            String s = (String)em.nextElement();
            out.println(s + ": " + req.getHeader(s));
        }

        out.println("<PRE>");
        out.println("</BODY></HTML>");
    }
}
