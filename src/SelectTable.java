import java.sql.*;

class SelectTable {
    public static void main(String args[]) throws Exception {
        /* jdbc 드라이버를 로드한다. */
        Class.forName("org.mariadb.jdbc.Driver");
        /* 데이터베이스에 접속한다. 적절한 jdbc URL 설정한다. */
        Connection conn = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from product");

        while (rs.next()) {
            System.out.print(rs.getString("id") + "  ");
            System.out.print(rs.getString("classid") + "  ");
            System.out.print(rs.getString("name") + "  ");
            System.out.print(rs.getInt("balance") + "  ");
            System.out.print(rs.getFloat("price") + "\n");
        }
        conn.close();
        rs.close();
        stmt.close();

    }
}
