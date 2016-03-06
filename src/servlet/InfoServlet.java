package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        Cookie cookie[] = req.getCookies();

        if (cookie == null || cookie.length == 0) {
            res.sendRedirect("/info.html");
        }
        else {
            for (int i = 0; i < cookie.length; i++) {
                if (cookie[i].getName().equals("interestitem")) {
                    if (cookie[i].getValue().equals("kindergarten")) {
                        res.sendRedirect(
                            "http://www.educakorea.co.kr/educa/home/" +
                            "educakorea/mall.php?cat=3407");
                    }
                    else if (cookie[i].getValue().equals("elementary")) {
                        res.sendRedirect(
                            "http://www.educakorea.co.kr/educa/home/" +
                            "educakorea/mall.php?cat=3401");
                    }
                    else if (cookie[i].getValue().equals("middlehigh")) {
                        res.sendRedirect(
                            "http://www.educakorea.co.kr/educa/home/" +
                            "educakorea/mall.php?cat=3408");
                    }
                    else if (cookie[i].getValue().equals("edutool")) {
                        res.sendRedirect(
                            "http://www.educakorea.co.kr/educa/home/" +
                            "educakorea/mall.php?cat=04");
                    }
                    else {
                        res.sendRedirect("/info.html");
                    }
                }
            }
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String item = req.getParameter("item");
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        boolean flag = true;
        Cookie cookie[] = req.getCookies();

        for (int i = 0; cookie != null && i < cookie.length; i++) {
            if (cookie[i].getName().equals("interestitem")) {
                flag = false;
            }
        }

        Cookie newcookie = null;

        if (flag == true) {
            if (item.equals("유치원생")) {
                newcookie = new Cookie("interestitem", "kindergarten");
            }
            else if (item.equals("초등학생")) {
                newcookie = new Cookie("interestitem", "elementary");
            }
            else if (item.equals("중고등학생")) {
                newcookie = new Cookie("interestitem", "middlehigh");
            }
            else if (item.equals("교육교구")) {
                newcookie = new Cookie("interestitem", "edutool");
            }

            newcookie.setMaxAge(60 * 60 * 24);
            res.addCookie(newcookie);
            out.print("<h4>관심 항목을 설정하였습니다.</h4>");
            out.print("<h4><a href=" + req.getRequestURL() + ">여기</A>" +
                "를 선택하십시오</h4>");
            out.close();
            return;
        }
        out.print("<h4>관심 항목이 이미 설정되어 있습니다.");
        out.close();
    }
}
