package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class AdditionalInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html;charset=UTF-8");
        out = res.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Request 정보 출력 Servlet</TITLE></HEAD");
        out.println("<BODY>");
        out.println("<H3>추가적인 요청 정보</H3>");
        out.println("<PRE>");
        out.println("Request Method: " + req.getMethod());
        out.println("Path Info: " + req.getPathInfo());
        out.println("Path Translated: " + req.getPathTranslated());
        out.println("Query String: " + req.getQueryString());
        out.println("Content Length: " + req.getContentType());
        out.println("Content Type: " + req.getContentType());
        out.println("</PRE>");
        out.println("</BODY></HTML>");
    }
}
