package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QueryServletGet extends HttpServlet {
    private String convert(String param) {
        String convertparam = null;

        try {
            convertparam = new String(param.getBytes("8859_1"), "UTF-8");
        }
        catch (Exception e) {
            System.out.println("한글 변환 오류 발생");
        }
        return convertparam;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
//        req.setCharacterEncoding("UTF-8");

        PrintWriter out;
        out = res.getWriter();

        /* convert 오류, convert 시 물음표(?)로 변환 */
//        String name = convert(req.getParameter("buyername"));
//        String addr = convert(req.getParameter("buyeraddr")); */
        String name = req.getParameter("buyername");
        String addr = req.getParameter("buyeraddr");
        String item[] = req.getParameterValues("buyeritem");


        out.println("<html><body><font color=red><h2>입력 결과</h2></font><hr>");
        out.println("이름은 " + name + "이고 주소는 " + addr + "입니다.");

        if (item == null) {
            out.println("<br>선택하신 상품이 없네요.");
        }
        else {
            out.println("<pre>선택하신 상품은");

            for (int i = 0; i < item.length; i++) {
                /* convert 오류, convert 시 물음표(?)로 변환 */
//                out.println(convert(item[i]) + ", ");
                out.print(item[i] + " ");
            }
            out.println("입니다.</pre><br>");
        }

        String getQuery = req.getQueryString();
        out.println("<br>GET방식으로 전달된 전체 Query: " + getQuery);
        out.println("</body></html>");
        out.close();
    }
}
