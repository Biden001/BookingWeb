package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Admin;
import utils.DBContext;

/**
 * AdminDAO - Quản lý đăng nhập Admin (phiên bản Basic - dễ hiểu)
 */
public class AdminDAO {

    // Hàm đăng nhập Admin
    public Admin login(String username, String password) {
        String sql = "SELECT username, password FROM Admin WHERE username = ? AND password = ?";
        
        try {
            // Bước 1: Lấy kết nối database
            Connection conn = DBContext.getConnection();
            
            // Bước 2: Chuẩn bị câu lệnh SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);    // Thay dấu ? thứ 1 bằng username
            stmt.setString(2, password);    // Thay dấu ? thứ 2 bằng password
            
            // Bước 3: Chạy câu lệnh SQL
            ResultSet rs = stmt.executeQuery();
            
            // Bước 4: Nếu có kết quả, tạo object Admin
            if (rs.next()) {
                Admin admin = new Admin();
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                conn.close();
                return admin;   // Đăng nhập thành công
            }
            
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Lỗi đăng nhập admin: " + e.getMessage());
        }
        
        return null;    // Đăng nhập thất bại
    }
}