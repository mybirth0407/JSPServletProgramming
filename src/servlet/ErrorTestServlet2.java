package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorTestServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        PrintWriter out = null;

        try {
            res.setContentType("text/html;charset=UTF-8");
            out = res.getWriter();
            String getQuery = req.getQueryString();

            out.println("<html><head><title>오류 처리 예제</title></head>");
            out.println("<body><h3>Query 문자열 추출</h3>");
            out.println("GET 방식으로 전달된 전체 Query: " + getQuery + "<br>");
            out.println("GET 방식으로 전달된 전체 Query 길이: " +
                getQuery.length());
            out.println("</body></html>");
        }
        catch (Exception e) {
            out.println("<html><head><title>오류 처리 예제</title></head>");
            out.println("<body><h3>오류 발생</h3>");
            out.println("요청을 처리하는 동안 오류가 발생하였습니다.<br>");
            out.println("죄송합니다.<br>");
            getServletContext().log("오류 발생 원인: " + e);
            out.println("</body></html>");
        }
        finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
