/**
 * Created by Yedarm Seong on 2016-02-08.
 */

package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class ContextTestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>ServletContext 활용 예제</TITLE><HEAD>");
        out.println("<BODY><H3>ServletContext를 활용한 정보 추출</H3>");

        ServletContext context = getServletContext();
        out.println("<H4>Servlet 컨테이너가 지원하는 Java Servlet API의 " +
            "major version: " + context.getMajorVersion() + "</H4>");
        out.println("<H4>Servlet 컨테이너가 지원하는 Java Servlet API의 " +
            "minor version: " + context.getMinorVersion() + "</H4>");
        out.println("<H4>컨텍스트의 이름: " + context.getServletContextName() +
            "</H4>");
        out.println("<H4>Servlet이 실행되고 있는 Servlet 컨테이너의 이름과 버전: " +
            context.getServerInfo() + "</H4>");
        out.println("<H4>/test.html의 실제 경로: " +
            context.getRealPath("/test.html") + "</H4>");
        context.log("로그 메세지 출력!!");
        out.println("</BODY><HTML>");
        out.close();
    }
}
