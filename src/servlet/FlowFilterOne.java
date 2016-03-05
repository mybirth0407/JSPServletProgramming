/**
 * Created by Yedarm Seong on 2016-02-24.
 */

package servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class FlowFilterOne implements Filter {
    public void init(FilterConfig config) {
        System.out.println("init() 호출.. one");
    }

    public void doFilter(
        ServletRequest req, ServletResponse res, FilterChain chain)
        throws java.io.IOException, ServletException {
        System.out.println("doFilter() 호출 전.. one");
        chain.doFilter(req, res);
        System.out.println("doFilter() 호출 후.. one");
    }

    public void destroy() {
        System.out.println("destroy() 호출 ..one");
    }
}
