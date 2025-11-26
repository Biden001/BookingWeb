package utils;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng kết nối
        try (Connection conn = DBContext.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Kết nối CSDL THÀNH CÔNG!");
            } else {
                System.out.println("❌ Kết nối CSDL THẤT BẠI: Đối tượng Connection là NULL.");
            }
        } catch (Exception e) {
            System.out.println("❌ LỖI KẾT NỐI CSDL: " + e.getMessage());
            e.printStackTrace();
        }
    }
}