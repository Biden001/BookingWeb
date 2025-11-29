package entity;

public class Ghe {
    private String maGhe;
    private int soGhe;
    private boolean trangThai;
    private String maPhong;

    public Ghe() {
    }
    public Ghe(String maGhe, int soGhe, boolean trangThai, String maPhong) {
        this.maGhe = maGhe;
        this.soGhe = soGhe;
        this.trangThai = trangThai;
        this.maPhong = maPhong;
    }
    public String getMaGhe() {
        return maGhe;
    }
    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    public int getSoGhe() {
        return soGhe;
    }
    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }
    public boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public String toString() {
        return "Ghe [maGhe=" + maGhe + ", soGhe=" + soGhe + ", trangThai=" + trangThai + ", maPhong=" + maPhong + "]";
    }
}
