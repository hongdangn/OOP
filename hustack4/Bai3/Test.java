import java.lang.*;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat(10, 20);
        hcn.in_chuvi_dientich();

        System.out.println();

        HinhVuong hv = new HinhVuong(10);
        hv.in_chuvi_dientich();
    }
}
