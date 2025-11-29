package entity;

public class Phim {
    private String maPhim;
    private String tenPhim;
    private String poster;
    private int thoiLuong;
    private String tomTat;
    private String tryler;

    public Phim() {
    }

    public Phim(String maPhim, String tenPhim, String poster, int thoiLuong, String tomTat, String tryler) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.poster = poster;
        this.thoiLuong = thoiLuong;
        this.tomTat = tomTat;
        this.tryler = tryler;
    }
    public String getMaPhim() {
        return maPhim;
    }   
    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }
    public String getTenPhim() {
        return tenPhim;
    }   
    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }   
    public String getPoster() {
        return poster;
    }   
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public int getThoiLuong() {
        return thoiLuong;
    }
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    public String getTomTat() {
        return tomTat;
    }
    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }
    public String getTryler() {
        return tryler;
    }
    public void setTryler(String tryler) {
        this.tryler = tryler;
    }
    public String toString() {
        return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", poster=" + poster + ", thoiLuong=" + thoiLuong
                + ", tomTat=" + tomTat + ", tryler=" + tryler + "]";
    }
}