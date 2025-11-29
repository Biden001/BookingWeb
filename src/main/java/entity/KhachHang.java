package entity;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String email;
    private String soDienThoai;
    private String username;
    private String password;

    public KhachHang() {
    }
    public KhachHang(String maKH, String tenKH, String email, String soDienThoai, String username, String password) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.username = username;
        this.password = password;
    }
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", email=" + email + ", soDienThoai=" + soDienThoai
                + ", username=" + username + ", password=" + password + "]";
    }
    
}