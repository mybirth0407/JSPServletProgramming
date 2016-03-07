package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTestServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        ServletContext context =getServletContext();
        RequestDispatcher rd = context.getRequestDispatcher(
            "/servlet.ForwardTestServlet2");
        rd.forward(req, res);
        out.close();
    }
}
