package jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jsp.beans.CountBean;

public class ShareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        Object obj = getServletContext().getAttribute("objapp");
        CountBean countobj = null;

        if (obj != null) {
            countobj = (CountBean) obj;
        }
        else {
            countobj = new CountBean();
            getServletContext().setAttribute("objapp", countobj);
        }

        out.println("<h4> Servlet에서 수행된 결과 </h4>");
        out.println("현재까지 누적된 값: " + countobj.getCount() + "<br>");
        out.println("<br>");
        out.println("100 추가 ==> <br>");
        countobj.setCount(100);
        out.println("결과값: " + countobj.getCount() + "<br>");
    }
}
