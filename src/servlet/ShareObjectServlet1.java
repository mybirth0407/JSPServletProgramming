package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class ShareObjectServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        ServletContext context = getServletContext();
        ShareObject obj1 = new ShareObject();
        obj1.setCount(100);
        obj1.setStr("객체 공유 테스트 - 1");
        context.setAttribute("objtest1", obj1);

        ShareObject obj2 = new ShareObject();
        obj2.setCount(1000);
        obj2.setStr("객체 공유 테스트 - 2");
        context.setAttribute("objtest2", obj2);

        out.println("<HTML><HEAD><TITLE>ServletContext 활용 예제" +
            "</TITLE></HEAD>");
        out.println("<BODY><H3>ServletContext를 활용한 객체 공유</H3>");
        out.println("<H4>컨텍스트에 ShareObject 객체를 등록하였습니다." +
            "(objtest1)</H4>");
        out.println("<H4>컨텍스트에 ShareObject 객체를 등록하였습니다." +
            "(objtest2)</H4>");
        out.println("</BODY></HTML>");
    }
}
