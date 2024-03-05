package lab02;

import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    Scanner sc = new Scanner(System.in);

    public HinhChuNhat(){
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieu(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai(){
        return this.chieuDai;
    }
    public double getChieuRong(){
        return this.chieuRong;
    }
    
    public double tinhChuVi(){
        double chieuDai = this.getChieuDai();
        double chieuRong = this.getChieuRong();
        return 2 * (chieuDai + chieuRong);
    }
    public double tinhDienTich(){
        double chieuDai = this.getChieuDai();
        double chieuRong = this.getChieuRong();
        return chieuDai * chieuRong;
    }

    public String toString(){
        double chieuDai = this.getChieuDai();
        double chieuRong = this.getChieuRong();
        return "Chieu dai: " + chieuDai + "\n" + "Chieu rong: " + chieuRong + "\n" 
                                               + "Chu vi: " + tinhChuVi() + "\n" 
                                               + "Dien tich: " + tinhDienTich() + "\n";
    }
    public void getInput(){
        System.out.print("Insert your chieuDai here: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("Insert your chieuRong here:");
        this.chieuRong = sc.nextDouble();
    }
}
