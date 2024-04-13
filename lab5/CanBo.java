import java.util.*;
import java.io.*;
import java.lang.*;

class CanBo{
    Scanner sc = new Scanner(System.in);
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo(){
    }

    public void nhapTTin(){
        System.out.println("Nhap thong tin:");
        System.out.print("Ho va ten: ");
        hoTen = sc.next();
        System.out.print("Gioi tinh: ");
        gioiTinh = sc.next();
        System.out.print("Nam sinh: ");
        namSinh = sc.nextInt();
        System.out.print("Dia chi: ");
        diaChi = sc.next();
    }

    public void inTTin(){
        System.out.println("-----------------------------");
        System.out.println("Hien thi thong tin:");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);
    }
}
