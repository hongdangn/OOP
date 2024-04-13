import java.lang.*;
import java.util.*;
import java.io.*;

class NhanVien {
    Scanner sc = new Scanner(System.in);
    protected String tenNhanVien;
    protected double LUONG_CO_BAN = 750000;
    protected double heSoLuong;
    protected double LUONG_MAX = 20000000;

    public NhanVien(String tenNhanVien, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    public boolean tangHeSoLuong(double heSo){
        if (LUONG_CO_BAN * (heSoLuong + heSo) > LUONG_MAX) return false;
        return true;
    }
    public double tinhLuong(){
        return heSoLuong * LUONG_CO_BAN;
    }
    public void inTTin(){
        System.out.print("He so tang luong: ");
        double heSo = sc.nextDouble();
        String quyetDinh;

        System.out.println("Ho va ten: " + tenNhanVien);
        if (tangHeSoLuong(heSo)) quyetDinh = "DUOC";
        else quyetDinh = "KHONG DUOC";
        System.out.println("Duoc tang luong hay khong? " + quyetDinh);
        System.out.println("Luong hien tai: " + tinhLuong());
    }
}

interface QuanLy {
    public double tinhHoaHong();
}

public class GiamDoc extends NhanVien implements QuanLy{
    private double phuCap;
    private double loiNhuanCongTy = 100000000;

    public GiamDoc(String tenGiamDoc, double heSoLuong, double phuCap){
        super(tenGiamDoc, heSoLuong);
        this.phuCap = phuCap;
    }
    public double tinhHoaHong(){
        return 0.05 * loiNhuanCongTy;
    }
    public double tinhLuong(){
        return super.tinhLuong() + tinhHoaHong() + phuCap;
    }

    public static void main(String[] args){
        GiamDoc gd = new GiamDoc("Dang Nguyen", 2.5, 3000000);
        gd.inTTin();
    }
}
