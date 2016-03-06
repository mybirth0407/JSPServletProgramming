package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorHandleServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        String code = null, message = null, type = null, uri = null;
        Object codeObj, messageObj, typeObj;
        Throwable throwableObj;

        codeObj = req.getAttribute("javax.servlet.error.status_code");
        messageObj = req.getAttribute("javax.servlet.error.message");
        typeObj = req.getAttribute("javax.servlet.error.exception_type");
        throwableObj =
            (Throwable)req.getAttribute("javax.servelt.error.exception");
        uri = (String)req.getAttribute("javax.servlet.error.request_uri");

        if (uri == null) {
            uri = req.getRequestURI();
        }

        if (codeObj != null) {
            code = codeObj.toString();
        }
        if (messageObj != null) {
            message = messageObj.toString();
        }
        if (typeObj != null) {
            type = typeObj.toString();
        }

        String reason = (code != null ? code: type);
        out.println("<html>");
        out.println("<head><title>" + reason + ": " + message +
            "</title></head>");
        out.println("<body>");
        out.println("<h2>Error Code: " + reason + "</h2>");
        out.println("<h3>Error Message: " + message + "</h3>");
        out.println("<pre>");

        if (throwableObj != null) {
            throwableObj.printStackTrace(out);
        }

        out.println("</pre>");
        out.println("<hr>");
        out.println("<I>Error File URI: " + uri + "</I>");
        out.println("</body></html>");
        out.close();
    }
}
