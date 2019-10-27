package jdbcwork05;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Test {
    
    public static void main(String args[]) {
       
        long start = System.currentTimeMillis();
        for(int i=0; i<50; i++) {
            test();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    private static void test() {
        try{
            Connection conn = SqlDAO.getConnection();
            String sql = "select * from TABLE1";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println(rs);
            pst.close();
         
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
