package lab02;

import java.util.Scanner;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;
    Scanner sc = new Scanner(System.in);

    public NhanVien(){
    }

    public void setTT(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien(){
        return this.tenNhanVien;
    }
    public double getLuongCoBan(){
        return this.luongCoBan;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    public double getLUONG_MAX(){
        return this.LUONG_MAX;
    }

    public void nhapTTin(){
        System.out.println("Nhap thong tin cua Dang Dung:");

        System.out.print("Ten nhan vien: ");
        this.tenNhanVien = sc.nextLine();

        System.out.print("Luong co ban: ");
        this.luongCoBan = sc.nextDouble();

        System.out.print("He so luong: ");
        this.heSoLuong = sc.nextDouble();

        System.out.print("Luong toi da: ");
        this.LUONG_MAX = sc.nextDouble();
    }

    public double tinhLuong(){
        double luongCoBan = this.getLuongCoBan();
        double heSoLuong = this.getHeSoLuong();
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double HeSo){
        double luongCoBan = this.getLuongCoBan();
        double heSoLuong = this.getHeSoLuong();
        double LUONG_MAX = this.getLUONG_MAX();
        if (luongCoBan * (heSoLuong + HeSo) > LUONG_MAX) return false;
        return true;
    }

    public void inTTin(){
        double heSoTang = 1.5;
        String quyetDinh = "";

        if (tangLuong(heSoTang)) quyetDinh = "DUOC";
        else quyetDinh = "KHONG DUOC";

        String outString = "Luong cua Dang Dung la: " + tinhLuong() + "\n"
                            + "Voi he so tang la: " + heSoTang + ", " 
                            + "Dang Dung " + quyetDinh + " tang luong";
        System.out.println(outString);
    }
}
