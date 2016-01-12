/**
 * Created by Yedarm Seong on 2016-01-11.
 */

import java.sql.*;

class DeleteTable {
    public static void main(String args[]) throws Exception {
        /* JDBC 드라이버를 로드한다. */
        Class.forName("org.mariadb.jdbc.Driver");
        /* 데이터베이스에 접속한다. 적절한 JDBC URL 설정한다. */
        Connection conn = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/jspservletdb", "root", "root");
        PreparedStatement pstmt = conn.prepareStatement(
                "DELETE from product WHERE balance < ?");

        int balance = 50;
        pstmt.setInt(1, balance);
        int del_su = pstmt.executeUpdate();
        System.out.println("재고가 " + balance + "미만인 상품 정보를"
        + del_su + "개 삭제하였습니다.");

        pstmt.close();
        conn.close();
    }
}
