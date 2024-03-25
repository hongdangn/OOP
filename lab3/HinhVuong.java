import java.util.*;
import java.io.*;
import java.lang.*;

class InheritTuGiac{
    protected Diem[] diem = new Diem[4];

    public void printToaDo(){
        for (int i = 0; i < 4; i++){
            System.out.println("(" + diem[i].getHoanhDo() + ", " + diem[i].getTungDo() + ")");
        }
    }
}

public class HinhVuong extends InheritTuGiac{
    public HinhVuong(){
        double hoanh = 5, tung = 3;
        for (int i = 0; i < 4; i++){
            diem[i] = new Diem();
            diem[i].setInfo(hoanh*(i*i), tung*(i*(i + 1)));
        }
    }

    public static void main(String[] args){
        HinhVuong hv = new HinhVuong();
        hv.printToaDo();
    }
}