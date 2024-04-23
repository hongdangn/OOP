import java.util.*;
import java.io.*;
import java.lang.*;


public class Prob4 {
    static int n, m;
    static int[] a = new int[1001], b = new int[1001];
    static int[] res = new int[2001];
    static int resLength = -1;

    static void reverseArray(int[] x, int length) {
        int[] y = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            y[i] = x[length - 1 - i];
        }
        
        for (int i = 0; i < length; i++) x[i] = y[i];
    }

    static void mergeIncreaseArray(int[] x, int[] y) {
        int dem = -1;
        int d1 = 0, d2 = 0;
        while (d1 < n && d2 < m) {
            if (x[d1] < y[d2]) {
                res[++dem] = x[d1];
                d1 += 1;
            } else {
                res[++dem] = y[d2];
                d2 += 1;
            }
        }

        while (d1 < n) {
            res[++dem] = x[d1];
            d1 += 1;
        }

        while (d2 < m) {
            res[++dem] = y[d2];
            d2 += 1;
        }
        
        resLength = dem + 1;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());    
        String[] inp1 = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inp1[i]);
        }

        m = Integer.parseInt(bf.readLine());    
        String[] inp2 = bf.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(inp2[i]);
        }

        if (a[0] > a[1]) reverseArray(a, n);
        if (b[0] > b[1]) reverseArray(b, m);
        mergeIncreaseArray(a, b);

        String s = bf.readLine();
        if (s.equalsIgnoreCase("dSort")) {
            reverseArray(res, resLength);
        } 

        for (int i = 0; i < resLength; i++) System.out.print(res[i] + " ");
    }
}
