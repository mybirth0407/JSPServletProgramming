package servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class CallBackServlet extends HttpServlet {
    public void init(ServletConfig sc) {
        System.out.println("init() 호출");
    }

    public void service(ServletRequest reg, ServletResponse res) {
        System.out.println("service() 호출");
    }

    public void destroy() {
        System.out.println("destroy() 호출");
    }
}
