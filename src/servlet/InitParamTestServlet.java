package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InitParamTestServlet extends HttpServlet {
    Connection conn;

    public void init(ServletConfig sc) {
        try {
            String account = sc.getInitParameter("account");
            String password = sc.getInitParameter("password");

            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/jspservletdb",
                account, password);
        }
        catch (Exception e){
            System.out.println("DB 접속 오류 발생: " + e);
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        PrintWriter out = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            res.setContentType("text/html;charset=UTF-8");
            out = res.getWriter();
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Request 정보 출력 Servlet</TITLE></HEAD>");
            out.println("<BODY>");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * from product");
            out.println("<PRE>");

            while (rs.next()) {
                out.print(rs.getString("id") + " ");
                out.print(rs.getString("classid") + " ");
                out.print(rs.getString("name") + " " );
                out.print(rs.getInt("balance") + " ");
                out.println(rs.getFloat("price"));
            }

            out.println("<PRE>");
            out.println("</BODY></HTML>");
            out.close();
        }
        catch (Exception e) {
            out.println("<H3>요청을 처리하는 동안 오류가 발생하였습니다!</H3>");
            out.println("</BODY><HTML>");
            out.close();
            System.out.println("오류: " + e);
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }

                if (rs != null) {
                    rs.close();
                }
            }
            catch (Exception e) {
                System.out.println("DB 자원 해제 오류 발생: " + e);
            }
        }
    }

    public void destroy() {
        try {
            if (conn != null) {
                conn.close();
            }
        }
        catch (Exception e) {
            System.out.println("DB 접속 해제 오류 발생: " + e);
        }
    }
}
