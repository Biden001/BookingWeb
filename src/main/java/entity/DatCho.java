package entity;

public class DatCho {
    private String maDatCho;
    private String maSuatChieu;
    private String maKH;
    private String maGhe;
    private int demNguoc;

    public DatCho() {
    }

    public DatCho(String maDatCho, String maSuatChieu, String maKH, String maGhe, int demNguoc) {
        this.maDatCho = maDatCho;
        this.maSuatChieu = maSuatChieu;
        this.maKH = maKH;
        this.maGhe = maGhe;
        this.demNguoc = demNguoc;
    }

    public String getMaDatCho() {
        return maDatCho;
    }

    public void setMaDatCho(String maDatCho) {
        this.maDatCho = maDatCho;
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

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public int getDemNguoc() {
        return demNguoc;
    }

    public void setDemNguoc(int demNguoc) {
        this.demNguoc = demNguoc;
    }

    public String toString() {
        return "DatCho [maDatCho=" + maDatCho + ", maSuatChieu=" + maSuatChieu + ", maKH=" + maKH + ", maGhe=" + maGhe + ", demNguoc=" + demNguoc + "]";
    }
}