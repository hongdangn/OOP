import java.io.*;
import java.util.*;
import java.lang.*;

class NhanVienCoHuu extends NhanVien {
    Scanner sc = new Scanner(System.in);
    protected double luongCoBan;
    protected double heSoLuong;

    public NhanVienCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangHeSoLuong(double heSoTang) {
        if (luongCoBan * (heSoTang + heSoLuong) > LUONG_MAX) return false;
        return true;
    }

    public void inThongTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong cua " + tenNhanVien + ": " + tinhLuong());
        System.out.print("He so tang: ");
        double heSoTang = sc.nextDouble();

        boolean tangHSL = tangHeSoLuong(heSoTang);
        if (tangHSL) System.out.println("Co tang luong");
        else System.out.println("Khong tang luong");
    }
}
