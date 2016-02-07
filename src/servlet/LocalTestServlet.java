/**
 * Created by Yedarm Seong on 2016-02-08.
 */

package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class LocalTestServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        String str = null;
        int number = 0;

        str = req.getParameter("sendmessage");
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>MUltiThread Test</TITLE></HEAD>");
        out.println("<BODY><H2>처리 결과(지역 변수)</H2>");

        while (number++ < 10) {
            String strnum = "[" + number + "]";
            out.println("MultiThreadTest: " + str + " " + strnum + "<br>");
            out.flush();

            System.out.println("MultiThreadTest: " + str + " " + strnum +
                "<br>");

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

        out.println("<H2>Done " + str + " !!</H2>");
        out.println("</BODY></HTML>");
        out.close();
    }
}
