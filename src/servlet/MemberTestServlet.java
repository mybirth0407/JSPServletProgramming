package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class MemberTestServlet extends HttpServlet {
    String str;
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        int number = 0;

        str = req.getParameter("sendmessage");
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>MultiThread test</TITLE></HEAD>");
        out.println("<BODY><H2>처리 결과(멤버 변수)</H2>");

        while (number++ < 10) {
            String strnum = "[" + number + "]";
            out.println("MultiThreadTest: " + str + " " + strnum + "<BR>");
            out.flush();
            System.out.println("MultiThreadTest: " + str + " " + strnum +
                "<br>");

            try {
                Thread.sleep(10000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        out.println("<H2>Done " + str + " !</H2>");
        out.println("</BODY></HTML>");
        out.close();
    }
}
