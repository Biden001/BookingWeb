package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.KhachHang;
import utils.DBContext;

/**
 * KhachHangDAO - phiên bản đơn giản (basic) để quản lý KhachHang (User)
 * - login: kiểm tra username/password
 * - isUsernameExists, isEmailExists: kiểm tra tồn tại
 * - createKhachHang: thêm user mới
 * - generateMaKH: tạo mã KH đơn giản
 */
public class KhachHangDAO {

    // Đăng nhập (simple, không mã hóa mật khẩu)
    public KhachHang login(String username, String password) {
        String sql = "SELECT * FROM KhachHang WHERE username = ? AND password = ?";
        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("maKH"));
                    kh.setTenKH(rs.getString("tenKH"));
                    kh.setEmail(rs.getString("email"));
                    kh.setSoDienThoai(rs.getString("soDienThoai"));
                    kh.setUsername(rs.getString("username"));
                    kh.setPassword(rs.getString("password"));
                    return kh;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isUsernameExists(String username) {
        String sql = "SELECT COUNT(*) FROM KhachHang WHERE username = ?";
        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isEmailExists(String email) {
        String sql = "SELECT COUNT(*) FROM KhachHang WHERE email = ?";
        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createKhachHang(KhachHang kh) {
        String sql = "INSERT INTO KhachHang (maKH, tenKH, email, soDienThoai, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kh.getMaKH());
            stmt.setString(2, kh.getTenKH());
            stmt.setString(3, kh.getEmail());
            stmt.setString(4, kh.getSoDienThoai());
            stmt.setString(5, kh.getUsername());
            stmt.setString(6, kh.getPassword());
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String generateMaKH() {
        String sql = "SELECT MAX(CAST(SUBSTRING(maKH, 3, LEN(maKH)) AS INT)) FROM KhachHang";
        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int maxId = rs.getInt(1);
                return "KH" + String.format("%03d", maxId + 1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "KH001";
    }
}
