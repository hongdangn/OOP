import java.io.*;
import java.util.*;
import java.lang.*;

public class Bai2b {
    static Scanner sc = new Scanner(System.in);
    static int[] x = new int[20];
    static int n = sc.nextInt(), sum = sc.nextInt();
    static int[] a = new int[n];

    static void Try(int s, int k) {
        if (a[k] == 0) {
            if (k == 1) return;
            Try(s, k - 1);
        } else {
            for (int i = 1; i <= s/a[k]; i++) {
                x[k] = i;
                if (k == 0) {
                    if (x[k] * a[k] == s) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(x[j] + " ");
                        }
                        System.out.println();
                    }
                } else Try(s - i*a[k], k - 1);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Try(sum, n - 1);
    }
}
