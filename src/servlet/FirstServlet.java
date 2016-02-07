/**
 * Created by Yedarm Seong on 2016-02-07.
 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        /* 응답되는 내용이 HTML 형식 내용이며
         * KSC5601 로 변환하여 출력하도록 charset 설정
         * res.setContentType("text/html; charset=EUC-KR");
         */
        PrintWriter out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>Response Example</TITLE>");
        out.println("<HEAD><BODY><H1>Have a nice day!</H1>");
        out.println("<BODY></HTML>");
        /* 출력 객체를 close 하면 출력 버퍼의 내용을 브라우저로 전송한다. */
        out.close();
    }
}
