import java.util.*;

public class MaxSubseq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++){
            array[i] = sc.nextInt();
        }
        int tmpSum = array[0], maxSum = array[0];
        for (int i = 1; i < numElements; i++){
            if (tmpSum > 0) tmpSum += array[i];
            else tmpSum = array[i];
            if (tmpSum > maxSum) maxSum = tmpSum;
        }
        System.out.println(maxSum);
    }
}
