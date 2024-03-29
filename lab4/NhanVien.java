import java.util.*;
import java.io.*;
import java.lang.*;

public class NhanVien {
    Scanner sc  = new Scanner(System.in);
    private String tenNhanVien;
    private double heSoLuong;
    private double LUONG_CO_BAN = 750000;
    private double LUONG_MAX = 20000000;

    public NhanVien(){
    }

    public boolean tangLuong(double heSoThuong){
        if (LUONG_CO_BAN * (heSoLuong + heSoThuong) > LUONG_MAX){
            return false;
        }
        return true;
    }

    public double tinhLuong(){
        return LUONG_CO_BAN * heSoLuong;
    }

    public void nhapTTin(){
        System.out.println("Nhap thong tin nhan vien:");

        System.out.print("Ho va ten: ");
        this.tenNhanVien = sc.nextLine();

        System.out.print("He so luong: ");
        this.heSoLuong = sc.nextDouble();

    }

    public void inTTin(){
        String quyetDinh = "";
        System.out.print("He so thuong cua " + tenNhanVien + ":");
        double heSoThuong = sc.nextDouble();

        if (tangLuong(heSoThuong)) quyetDinh = "CO TANG";
        else quyetDinh = "KHONG TANG";

        System.out.println("Ho ten: " + tenNhanVien);
        System.out.println("Luong cua " + tenNhanVien + " la: " + tinhLuong());
        System.out.println("Quyet dinh tang luong: " + quyetDinh);
    }
}
