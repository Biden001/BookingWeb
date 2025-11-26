package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private static final String DB_USER = "sa";        // Thay bằng User SQL Server của bạn
    private static final String DB_PASS = "sa";    // Thay bằng Password SQL Server của bạn
    private static final String DB_NAME = "BOOKINGTICKET"; // Thay bằng Tên Database của bạn
    
    // JDBC URL tiêu chuẩn cho SQL Server
    private static final String URL = "jdbc:sqlserver://DESKTOP-PAL6NTP\\SQLEXPRESS:1433;databaseName=" + DB_NAME + ";encrypt=true;trustServerCertificate=true";

    /**
     * Hàm trả về đối tượng Connection tới CSDL
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Tải driver JDBC (dùng file .jar bạn đã copy vào WEB-INF/lib)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Lỗi: Không tìm thấy Driver JDBC.");
            e.printStackTrace();
            return null;
        }
        
        // Trả về Connection bằng thông tin User/Pass/URL
        return DriverManager.getConnection(URL, DB_USER, DB_PASS);
    }
}