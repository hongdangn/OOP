import java.io.*;
import java.lang.*;
import java.util.*;

public class PhongBan {
    static Scanner sc = new Scanner(System.in);
    static String tenPhongBan;
    static int soNhanVien;
    static int SO_NV_MAX = 10;
    static NhanVien[] dsNhanVien = new NhanVien[SO_NV_MAX];

    public static boolean themNV(NhanVien nv) {
        if (soNhanVien >= SO_NV_MAX) return false;
        dsNhanVien[soNhanVien] = nv;
        soNhanVien += 1;
        return true;
    }

    public static NhanVien xoaNV() {
        if (soNhanVien == 0) return null;
        NhanVien nv = dsNhanVien[soNhanVien];
        dsNhanVien[soNhanVien] = null;
        soNhanVien -= 1;
        return nv;
    }

    public static double tinhTongLuong() {
        int tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += dsNhanVien[i].tinhLuong();
        }
        return tongLuong;
    }

    public static void inThongTin() {
        System.out.println("Ten phong ban: " + tenPhongBan);
        System.out.println("-----------------------\nIn thong tin cac thanh vien: \n");

        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhan vien thu " + (i + 1));
            System.out.println("Ten nhan vien: " + dsNhanVien[i].getName());
            System.out.println("Luong: " + dsNhanVien[i].tinhLuong() + "\n");
        }

        System.out.println("Tong luong ca " + tenPhongBan + ": " + tinhTongLuong());
    }

    public static void main(String[] args) {
        System.out.print("Ten phong ban: ");
        tenPhongBan = sc.nextLine();
        NhanVienHopDong nv1 = new NhanVienHopDong("dang", 20);
        NhanVienCoHuu nv2 = new NhanVienCoHuu("thong", 15, 2);
        boolean them1 = themNV(nv1), them2 = themNV(nv2);
        inThongTin();
    }
}
