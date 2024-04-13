import java.util.*;
import java.io.*;
import java.lang.*;

class CongNhan extends CanBo{
    private byte bac;
    public CongNhan(){
    }
}

class KySu extends CanBo{
    private String nganhDaoTao;
    public KySu(){
    }
}

class NhanVien extends CanBo{
    private String congViec;
    public NhanVien(){
    }
    public void setCV(String congViec){
        this.congViec = congViec;
    }
    public void nhapTTin(){
        super.nhapTTin();
        System.out.print("Cong viec: ");
        congViec = sc.next();
    }
    public void inTTin(){
        super.inTTin();
        System.out.print("Cong viec: " + congViec);
    }
}

public class QLCB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String canbo = sc.nextLine();
        if (canbo.equalsIgnoreCase("nhan vien")){
            NhanVien nv = new NhanVien();
            nv.nhapTTin();
            nv.inTTin();
        }
        // String canbo = sc.nextLine();
        // System.out.println(canbo.equalsIgnoreCase("nhan vien"));
    }
}



