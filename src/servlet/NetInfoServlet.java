/**
 * Created by Yedarm Seong on 2016-02-07.
 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class NetInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html;charset=UTF-8");
        out = res.getWriter();
        out.println("<HMTL>");
        out.println("<HEAD><TITLE>Request 정보 출력 Servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H3>네트워크 관련 요청 정보</H3>");
        out.println("<PRE>");
        out.println("Request Scheme: " + req.getScheme());
        out.println("Server Name: " + req.getServerName());
        out.println("Server Address: " + req.getLocalAddr());
        out.println("Server Port: " + req.getServerPort());
        out.println("Client Address: " + req.getRemoteAddr());
        out.println("Client Host: " + req.getRemoteHost());
        out.println("Client Port: " + req.getRemotePort());
        out.println("</PRE>");
        out.println("</BODY></HTML>");
    }
}
