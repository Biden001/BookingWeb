package entity;

public class Ve {
    private String maVe;
    private String maGhe;
    private String maSuatChieu;
    private String maKH;

    public Ve() {
    }
    public Ve(String maVe, String maGhe, String maSuatChieu, String maKH) {
        this.maVe = maVe;
        this.maGhe = maGhe;
        this.maSuatChieu = maSuatChieu;
        this.maKH = maKH;
    }
    public String getMaVe() {
        return maVe;
    }
    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }
    public String getMaGhe() {
        return maGhe;
    }
    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    public String getMaSuatChieu() {
        return maSuatChieu;
    }
    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String toString() {
        return "Ve [maVe=" + maVe + ", maGhe=" + maGhe + ", maSuatChieu=" + maSuatChieu + ", maKH=" + maKH + "]";
    }
}