import java.util.*;
import java.io.*;
import java.lang.*;

class InheritTuGiac{
    Scanner sc = new Scanner(System.in);
    protected Diem[] diem = new Diem[4];

    public InheritTuGiac(Diem[] diem){
        this.diem = diem;
    }

    public void nhapToaDo(){
        System.out.println("Nhap toa do cac diem:");
        for (int i = 0; i < 4; i++){
            diem[i] = new Diem();
            System.out.print("Diem " + (i + 1) + ": ");
            double hoanhDo = sc.nextDouble(), tungDo = sc.nextDouble();
            diem[i].setInfo(hoanhDo, tungDo);
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
}

public class ConstructorTuGiac extends InheritTuGiac{
    public ConstructorTuGiac(){
        super(new Diem[4]);
    }

    public static void main(String[] args){
        ConstructorTuGiac hv = new ConstructorTuGiac();
        hv.nhapToaDo();
        hv.tinhChuVi();
    }
}