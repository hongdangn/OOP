import java.io.*;
import java.lang.*;
import java.util.*;

class NhanVienHopDong extends NhanVien {
    private double luongHopDong;

    public NhanVienHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }
    public double tinhLuong() {
        return luongHopDong;
    }
    public void inThongTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong cua " + tenNhanVien + ": " + tinhLuong());
    }
}
