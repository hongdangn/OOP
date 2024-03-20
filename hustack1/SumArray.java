import java.util.Scanner;
import java.util.*;

public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        int[] array = new int[numElements];
        int sum = 0;
        for (int i = 0; i < numElements; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
