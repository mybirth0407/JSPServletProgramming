package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>forward 예제</title>");
        out.println("</head><body><h3>ForwardTestServlet3의 수행 결과</h3>");
        out.println("</body></html>");

        /* forward 되는 secondservletforward2에 Account 객체를 전달 */
        String name = req.getParameter("name");
        String number = req.getParameter("number");
        req.setAttribute("userinfo", new Account(name, number));

        /* HttpServletRequest의 getRequestDispatcher()를 사용 */
        RequestDispatcher rd = req.getRequestDispatcher(
            "/servlet.ForwardTestServlet4");
        rd.forward(req, res);
        out.close();
    }
}
