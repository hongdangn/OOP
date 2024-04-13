import java.io.*;
import java.lang.*;
import java.util.*;

class ThiSinh {
    Scanner sc = new Scanner(System.in);

    protected int soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String uuTien;

    public ThiSinh(){}

    public void nhapTTin(){
        System.out.print("Ho va ten: ");
        this.hoTen = sc.nextLine();

        System.out.print("So bao danh: ");
        this.soBaoDanh = Integer.parseInt(sc.nextLine());

        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();

        System.out.print("Uu tien: ");
        this.uuTien = sc.nextLine();
    }

    public void inTTin(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("So bao danh: " + soBaoDanh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Uu tien: " + uuTien);
    }
}

class ThiSinhKhoiA extends ThiSinh{
    protected String mon1, mon2, mon3;

    public ThiSinhKhoiA(){
    }

    public void nhapTTin(){
        super.nhapTTin();

        System.out.print("Mon thi: ");
        String[] monThi = sc.nextLine().split(" ");
        this.mon1 = monThi[0];
        // this.mon2 = monThi[1];
        // this.mon3 = monThi[2];
    }

    public void inTTin(){
        super.inTTin();
        System.out.print("Mon thi: " + mon1 + ", " + mon2 + ", " + mon3 + ".");
    }
}

class ThiSinhKhoiB extends ThiSinh{
    protected String mon1, mon2, mon3;

    public ThiSinhKhoiB(){
    }

    public void nhapTTin(){
        super.nhapTTin();
        
        System.out.print("Mon thi: ");
        String[] monThi = sc.nextLine().split(" ");
        this.mon1 = monThi[0];
        this.mon2 = monThi[1];
        this.mon3 = monThi[2];
    }

    public void inTTin(){
        super.inTTin();
        System.out.print("Mon thi: " + mon1 + " ," + mon2 + " ," + mon3 + ".");
    }
}

class ThiSinhKhoiC extends ThiSinh{
    protected String mon1, mon2, mon3;

    public ThiSinhKhoiC(){
    }

    public void nhapTTin(){
        super.nhapTTin();
        
        System.out.print("Mon thi: ");
        String[] monThi = sc.nextLine().split(" ");
        this.mon1 = monThi[0];
        this.mon2 = monThi[1];
        this.mon3 = monThi[2];
    }

    public void inTTin(){
        super.inTTin();
        System.out.print("Mon thi: " + mon1 + " ," + mon2 + " ," + mon3 + ".");
    }
}
