package project_uas;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class koneksi {
    public static Connection sambung_ke_db() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("SmartParking");
            m.setServerName("localhost");
            m.setPort(3306);
            m.setServerTimezone("Asia/Jakarta");

            Connection c = m.getConnection();
            return c;
            
        } catch (SQLException e) {
            // Penanganan eror
            System.err.println("Eror: " + e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        Connection c = sambung_ke_db();
        if (c !=null){
            System.out.println("Terhubung");
    }else{
            System.out.println("Gagal Terhubung");
            }
            
} 
}
