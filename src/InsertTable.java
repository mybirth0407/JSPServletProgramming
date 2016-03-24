import java.sql.*;

class InsertTable {
    public static void main(String args[]) throws Exception {
        try {
            /* jdbc 드라이버를 로드한다. */
            Class.forName("org.mariadb.jdbc.Driver");
            /* 데이터베이스에 접속한다. 적절한 JDC URL 설정한다. */
            Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT into product values " +
            "('00001', '00', '자바 프로그래밍', 50, 16500)");
            stmt.executeUpdate("INSERT into product values " +
            "('00002', '00', 'J2EE 구현 패턴', 40, 12000)");
            stmt.executeUpdate("INSERT into product values " +
            "('00002', '00', 'JSP 2.0', 60, 18000)");
            System.out.println("데이터들을 추가하였습니다.");
            stmt.close();
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("오류 발생: " + e);
            System.out.println("오류 코드: " + e.getErrorCode());
            System.out.println("오류 상태: " + e.getSQLState());
        }
    }
}
