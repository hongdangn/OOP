abstract class NhanVien {
    protected String tenNhanVien;
    protected double LUONG_MAX = 100;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getName() {
        return tenNhanVien;
    }
    public abstract double tinhLuong();
    public abstract void inThongTin();
}
