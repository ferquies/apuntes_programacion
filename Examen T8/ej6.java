import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ej6 {
    public static void main(String args[]) {
        String driver = "com.mysql.jdbc.Driver";
           
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
            
        try {
            try {
                Class.forName(driver).newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(ej6.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ej6.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ej6.class.getName()).log(Level.SEVERE, null, ex);
        }

        String url = "jdbc:mysql://localhost:3306/empresa";

        try {
            String sql = "SELECT * FROM grupos;";
            conn = DriverManager.getConnection(url,"user","");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                if(rs.getInt("id") == 2) {
                    rs.updateString("descripcion", "Accesorios");
                    rs.updateRow();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ej6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
