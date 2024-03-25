import java.util.*;
import java.io.*;
import java.lang.*;

public class TuGiac {
    private Diem[] diem = new Diem[4];

    public TuGiac(){
        for (int i = 0; i < 4; i++){
            diem[i] = new Diem();
        }
    }

    public void SetGetInfo(){
        double hoanh = 5, tung = 2;

        System.out.println("Nhap toa do cho cac diem: ");
        for (int i = 0; i < 4; i++){
            System.out.print("Diem " + (i + 1) + ": ");
            diem[i].setInfo(hoanh*(i*i), tung*(i*(i + 1)));
            System.out.println("(" + diem[i].getHoanhDo() + ", " + diem[i].getTungDo() + ")");
        }
    }

    public void tinhChuVi(){
        double chuVi = 0;
        for (int i = 0; i < 3; i++){
            double khoangCach = Math.sqrt(Math.pow((diem[i].getHoanhDo() - diem[i + 1].getHoanhDo()), 2)
                                      + Math.pow((diem[i].getTungDo() - diem[i + 1].getTungDo()), 2));
            chuVi += khoangCach;
        }
        System.out.println("Chu vi tu giac: " + chuVi);
    }

    public static void main(String[] args) throws IOException{
        TuGiac tuGiac = new TuGiac();
        tuGiac.SetGetInfo();
        tuGiac.tinhChuVi();
    }
}