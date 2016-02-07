/**
 * Created by Yedarm Seong on 2016-02-08.
 */

package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class ShareObjectServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>ServletContext 활용 예제</TITLE></HEAD>");
        out.println("<BODY><H3>ServletContext를 활용한 객체 공유</H3>");

        ServletContext context = getServletContext();
        ShareObject obj1 = (ShareObject)context.getAttribute("objtest1");
        ShareObject obj2 = (ShareObject)context.getAttribute("objtest2");

        out.println("<H4>추출된 ShareObject 객체(objtest1): " +
            obj1.getCount() + ", " + obj1.getStr() + "</H4>");
        out.println("<H4>추출된 ShareObject 객체(objtest2): " +
            obj2.getCount() + ", " + obj2.getStr() + "</H4>");
        out.println("</BODY></HTML>");
    }
}