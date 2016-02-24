/**
 * Created by Yedarm Seong on 2016-02-24.
 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorTestServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out;
        out = res.getWriter();

        String getQuery = req.getQueryString();

        out.println("<html><head><title>오류 처리 예제</title></head>");
        out.println("<body><h3>Query 문자열 추출</h3>");
        out.println("GET 방식으로 전달된 전체 Query: " + getQuery + "<br>");
        out.println("GET 방식으로 전달된 전체 Query 길이: " + getQuery.length());
        out.println("</body></html>");
        out.close();
    }
}
