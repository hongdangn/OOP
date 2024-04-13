import java.io.*;
import java.lang.*;
import java.util.*;

public class TuyenSinh {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("So thi sinh: ");
        int soTS = Integer.parseInt(bf.readLine());
        int demA = -1, demB = -1, demC = -1;

        ThiSinhKhoiA[] khoiA = new ThiSinhKhoiA[soTS];
        ThiSinhKhoiB[] khoiB = new ThiSinhKhoiB[soTS];
        ThiSinhKhoiC[] khoiC = new ThiSinhKhoiC[soTS];

        String[] khoi = new String[soTS];
        int[] thuTu = new int[soTS];

        System.out.println("Nhap thong tin thi sinh:");
        for (int i = 0; i < soTS; i++){
            String khoiThi = bf.readLine();
            if (khoiThi.equalsIgnoreCase("Khoi A")){
                khoiA[++demA] = new ThiSinhKhoiA();
                khoiA[demA].nhapTTin();
                khoi[i] = "Khoi A";
                thuTu[i] = demA;
            } else if (khoiThi.equalsIgnoreCase("Khoi B")){
                khoiB[++demB] = new ThiSinhKhoiB();
                khoiB[demB].nhapTTin();
                khoi[i] = "Khoi B";
                thuTu[i] = demB;
            } else {
                khoiC[++demC] = new ThiSinhKhoiC();
                khoiC[demC].nhapTTin();
                khoi[i] = "Khoi C";
                thuTu[i] = demC;
            }
        }

        System.out.println("------------------------------");
        System.out.print("Nhap so bao danh thi sinh can tim: ");
        int SBDCanTim = Integer.parseInt(bf.readLine());

        System.out.println("In thong tin thi sinh can tim: ");
        if (khoi[SBDCanTim].equalsIgnoreCase("Khoi A")){
            khoiA[thuTu[SBDCanTim]].inTTin();
        } else if (khoi[SBDCanTim].equalsIgnoreCase("Khoi B")){
            khoiB[thuTu[SBDCanTim]].inTTin();
        } else {
            khoiC[thuTu[SBDCanTim]].inTTin();
        }
    }
}