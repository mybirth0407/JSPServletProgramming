import java.sql.*;

class test {
    public static void main(String args[]) throws Exception {
        /* jdbc 드라이버를 로드한다. */
        Class.forName("org.mariadb.jdbc.Driver");
        /* 데이터베이스에 접속한다. 적절한 JDC URL 설정한다. */
        Connection conn = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
        Statement stmt = conn.createStatement();

        stmt.close();
        conn.close();
    }
}