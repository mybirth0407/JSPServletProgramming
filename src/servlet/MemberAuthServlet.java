package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MemberAuthServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        Connection conn = null;
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("member_id");
        String passwd = req.getParameter("member_passwd");

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
            Statement stmt = conn.createStatement();

            String selectquery =
                "select id, passwd from member where id ='" + id + "'";
            ResultSet rs = stmt.executeQuery(selectquery);

            if (rs.next()) {
                if (rs.getString(2).trim().equals(passwd)) {
                    if (session_set(req, res, id)) {
                        out.print("<h4>회원 인증이 완료되었습니다.</h4>");
                    }
                    else {
                        out.print("<h4>이미 회원 인증을 하셨네요.</h4>");
                    }
                }
                else {
                    out.print("<h4>패스워드가 틀립니다.<br>" +
                        "회원 인증 절차를 다시 수행하여 주세요</h4>");
                }
            }
            else {
                out.print("<h4>입력하신 계정이 존재하지 않습니다.</h4>");
            }
        }
        catch (ClassNotFoundException e1) {
            out.print("<h4>시스템 장애로 처리가 불가능합니다.</h4>");
            System.out.println("드라이버 로딩 오류 발생: " + e1);

        }
        catch (SQLException e2) {
            out.print("<h4>시스템 장애로 처리가 불가능합니다.</h4>");
            System.out.println("DB연동 오류 발생: " + e2);
        }
        finally {
            out.close();

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

    public boolean session_set(
        HttpServletRequest req, HttpServletResponse res, String id)
        throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        if (session.isNew() || session.getAttribute("member_id") == null) {
            session.setAttribute("member_id", id);
            return true;
        }
        else {
            return false;
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession(false);

        if (session != null && session.getAttribute("memeber_id") != null) {
            session.removeAttribute("member_id");
            out.print("<h4>인증 상태가 해제되었습니다.</h4>");
        }
        else {
            out.print("<h4>인증을 수행하지 않으셨네요.</h4>");
        }
        out.close();
    }
}
