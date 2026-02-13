package patient_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/health_clinic_app";
    private static final String USER = "root";
    private static final String PASSWORD = "Whatiscar123@";
    // This method gives a fresh DB connection whenever needed
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

