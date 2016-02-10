/**
 * Created by Yedarm Seong on 2016-02-11.
 */

package servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FileUploadInfoServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");

        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>파일 업로드 테스트</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>파일 올리기 성공</h3>");
        out.println("업로드 문서 타입 정보: " + req.getContentType() + "<br>");
        out.println("업로드 문서 타입 길이: " + req.getContentLength() + "<br>");
        out.println("<font color=blue>");

        InputStreamReader isr = new InputStreamReader(
            req.getInputStream(), "utf-8");
        BufferedReader br = new BufferedReader(isr);

        for (String line; (line = br.readLine()) != null;) {
            out.println(line + "<br>");
        }

        out.println("</font>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
