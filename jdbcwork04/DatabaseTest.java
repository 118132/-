package jdbcwork04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DatabaseTest {
    static IDatabaseConnection SQLServer = new SQLServerPool();
    public static void main(String args[]) {
        SQLServer.init();
        long start = System.currentTimeMillis();
        for(int i=0; i<5000; i++) {
            test();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void test() {
        try{
            Connection conn = SQLServer.getConnection();
            String sql = "select * from TABLE1";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println(rs);
            pst.close();
            SQLServer.close(conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
