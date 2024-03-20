import java.util.*;

public class AddNumbers {
    public static void addString(String a, String b){
        int maxLength = a.length();
        int metric = a.length() - b.length();
        int[] array = new int[23];
        int nho = 0, count = -1, lastDigit;
        for (int i = maxLength - 1; i >= 0; i--){
            if (i >= metric){
                lastDigit = (a.charAt(i) + b.charAt(i - metric) + nho - 96) % 10;
                nho = (a.charAt(i) + b.charAt(i) + nho - 96) / 10;
            }
            else{
                lastDigit = (a.charAt(i) + nho - 48) % 10;
                nho = (a.charAt(i) + nho - 48) / 10;
            }
            array[++count] = lastDigit;
            // System.out.print(array[count]);
        }
        if (nho == 1) array[++count] = 1;
        for (int i = count; i >= 0; i--){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() > b.length()) addString(a, b);
        else addString(b, a);
    }
}
