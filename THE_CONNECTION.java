import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class THE_CONNECTION {
    private static String servername = "localhost";
    private static String dbname = "realestatems";
    private static String username = "root";
    private static Integer portNumber = 3306;
    private static String password = "";
    
    
    public static Connection getTheConnection(){
        Connection connection =null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(password);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
        
        
    }
}
