package entity;

public class SuatChieu {
    private String maSuatChieu;
    private String maPhim;
    private String maPhongChieu;
    private String ngayChieu;
    private String gioChieu;
    private int thoiLuongChieu;

    public SuatChieu() {
    }

    public SuatChieu(String maSuatChieu, String maPhim, String maPhongChieu, String ngayChieu, String gioChieu,int thoiLuongChieu) {
        this.maSuatChieu = maSuatChieu;
        this.maPhim = maPhim;
        this.maPhongChieu = maPhongChieu;
        this.ngayChieu = ngayChieu;
        this.gioChieu = gioChieu;
        this.thoiLuongChieu = thoiLuongChieu;
    }

    public String getMaSuatChieu() {
        return maSuatChieu;
    }
    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }
    public String getMaPhim() {
        return maPhim;
    }
    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }
    public String getMaPhongChieu() {
        return maPhongChieu;
    }
    public void setMaPhongChieu(String maPhongChieu) {
        this.maPhongChieu = maPhongChieu;
    }
    public String getNgayChieu() {
        return ngayChieu;
    }
    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public String getGioChieu() {
        return gioChieu;
    }
    public void setGioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
    }
    public int getThoiLuongChieu() {
        return thoiLuongChieu;
    }
    public void setThoiLuongChieu(int thoiLuongChieu) {
        this.thoiLuongChieu = thoiLuongChieu;
    }
    public String toString() {
        return "SuatChieu [maSuatChieu=" + maSuatChieu + ", maPhim=" + maPhim + ", maPhongChieu=" + maPhongChieu
                + ", ngayChieu=" + ngayChieu + ", gioChieu=" + gioChieu + ", thoiLuongChieu=" + thoiLuongChieu + "]";
    }
    
}
