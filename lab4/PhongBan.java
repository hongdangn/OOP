import java.util.*;
import java.io.*;
import java.lang.*;

public class PhongBan {
    Scanner sc = new Scanner(System.in);
    private String tenPhongBan;
    private byte soNhanVien;
    private byte SO_NV_MAX = 100;
    private NhanVien[] danhSach = new NhanVien[SO_NV_MAX];

    public PhongBan(){
        for (int i = 0; i < SO_NV_MAX; i++){
            danhSach[i] = new NhanVien();
        }
    }

    public boolean themNV(NhanVien nv){
        if (soNhanVien < SO_NV_MAX){
            soNhanVien++;
            danhSach[soNhanVien] = nv;
            return true;
        }
        return false;
    }

    public NhanVien xoaNhanVien(){
        if (soNhanVien > 0){
            NhanVien tmp = danhSach[soNhanVien - 1];
            soNhanVien--;
            danhSach[soNhanVien - 1] = null;
            return tmp;
        }
        return null;
    }

    public double tongLuong(){
        double tong = 0;
        for (int i = 0; i < soNhanVien; i++){
            tong += danhSach[i].tinhLuong();
        }
        return tong;
    }

    public void nhapTTin(){
        System.out.print("So nhan vien la: ");
        soNhanVien = sc.nextByte();

        System.out.print("Ten phong ban la: ");
        tenPhongBan = sc.next();

        for (int i = 0; i < soNhanVien; i++){
            danhSach[i].nhapTTin();
        }
    }

    public void inTTin(){
        System.out.println("Ten phong: " + tenPhongBan);
        System.out.println("Phong co " + soNhanVien + " nhan vien.");
        for (int i = 0; i < soNhanVien; i++){
            danhSach[i].inTTin();
        }
        System.out.println("Tong luong la " + tongLuong());
    }

    public static void main(String[] args){
        PhongBan pb = new PhongBan();
        pb.nhapTTin();
        pb.inTTin();
    }
}
