package entity;

public class PhongChieu {
    private String maPhongChieu;
    private int soGheNgoi;

    public PhongChieu(String maPhongChieu, int soGheNgoi) {
        this.maPhongChieu = maPhongChieu;
        this.soGheNgoi = soGheNgoi;
    }

    public String getMaPhongChieu() {
        return maPhongChieu;
    }

    public void setMaPhongChieu(String maPhongChieu) {
        this.maPhongChieu = maPhongChieu;
    }

    public int getSoGheNgoi() {
        return soGheNgoi;
    }

    public void setSoGheNgoi(int soGheNgoi) {
        this.soGheNgoi = soGheNgoi;
    }

    public String toString() {
        return "PhongChieu [maPhongChieu=" + maPhongChieu + ", soGheNgoi=" + soGheNgoi + "]";
    }
}
