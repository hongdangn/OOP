import java.io.*;
import java.util.*;
import java.lang.*;

public class Bai2a {
    static int checkPrime(int n) {
        if (n == 2 || n == 3) return 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 1;
        }
        return 0;
    }

    static int dem_so_nguyento(int[] a) {
        int countPrime = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkPrime(a[i]) == 1) countPrime += 1;
        }
        return countPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(dem_so_nguyento(a));
    }
}