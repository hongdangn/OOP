package lab02;

public class Main1 {
    public static void main(String[] args){
        HinhChuNhat hcn_1 = new HinhChuNhat(20, 15);
        System.out.println(hcn_1.tinhDienTich());    
        
        HinhChuNhat hcn_2 = new HinhChuNhat();
        hcn_2.getInput();
        System.out.println(hcn_2.toString());
    }
}
