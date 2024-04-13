import java.util.*;
import java.io.*;
import java.lang.*;

class TruongPhong extends NhanVienCoHuu {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, 
                       double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double tinhLuong() {
        return super.tinhLuong() + phuCap * soNamDuongChuc;
    }

    public void inThongTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong cua " + tenNhanVien + ": " + tinhLuong());
    }
}
