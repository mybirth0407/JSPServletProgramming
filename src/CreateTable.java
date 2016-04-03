import java.sql.*;

class CreateTable {
    public static void main(String args[]) throws Exception {
        /* jdbc 드라이버를 로드한다. */
        Class.forName("org.mariadb.jdbc.Driver");
        /* 데이터베이스에 접속한다. 적절한 jdbc URL 설정한다. */
        Connection conn = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
        Statement stmt = conn.createStatement();

        if (true) {
            stmt.executeUpdate("CREATE TABLE product " +
                "(id char(5), classid char(2), " +
                "name varchar(50) character set utf8 not null," +
                "balance int, price float)");
            System.out.println("테이블이 생성되었습니다.");
        }
        else {
            stmt.executeUpdate("DROP TABLE product");
            System.out.println("테이블이 삭제되었습니다.");
        }

        stmt.close();
        conn.close();
    }
}