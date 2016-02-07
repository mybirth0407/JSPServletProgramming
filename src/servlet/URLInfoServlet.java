/**
 * Created by Yedarm Seong on 2016-02-07.
 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class URLInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html;charset=UTF-8");
        out = res.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Request 정보 출력 Servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H3>요청 방식과 프로토콜 정보</H3>");
        out.println("<PRE>");
        out.println("Request URI: " + req.getRequestURI());
        out.println("Request URL: " + req.getRequestURL());
        out.println("Context Path: " + req.getContextPath());
        out.println("Request Protocol: " + req.getProtocol());
        out.println("Servlet Path: " + req.getServletPath());
        out.println("</PRE>");
        out.println("</BODY></HTML>");
    }
}
