//JAVA 
import java.util.*; 
import java.io.*;
import java.lang.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class prob1 { 
    static int c, d, x, y;
    static int res = 30;
    static int[] arr1 = new int[15], arr2 = new int[15];
    static int[] res1 = new int[15], res2 = new int[15];

    static int gcd(int a, int b) {
        if (a == 0) {
            if (b == 0) return 1001;
            return b;
        } else if (b == 0) return a;
        
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    static void Try(int k) {
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                int tmp = c;
                c = d;
                d = tmp;
            } else if (i == 1) {
                c += d;
            } else c -= d;
            
            arr1[k] = c; arr2[k] = d;
            
            if (c == x && d == y) {
                if (k <= res) {
                    int tmp = 0;
                    for (int j = 1; j <= k; j++) {
                        if (arr1[j] < 0 || arr2[j] < 0) tmp = 1;
                    }
                    if (tmp == 0) {
                        res = k;
                        for (int j = 1; j <= k; j++) {
                            res1[j] = arr1[j]; res2[j] = arr2[j];
                        }
                    }
                }
            } else if (k != 13) {
                Try(k + 1);
            }
            
            if (i == 0) {
                int tmp = c;
                c = d;
                d = tmp;
            } else if (i == 1) c -= d;
            else c += d;
        }
    }
    public static void main(String[] args) throws IOException { 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = bf.readLine().split(" ");
        c = Integer.parseInt(inp[0]);
        d = Integer.parseInt(inp[1]);
        x = Integer.parseInt(inp[2]);
        y = Integer.parseInt(inp[3]);
        
    	if (gcd(x, y) != gcd(c, d)) System.out.println("-1");
        else {
            if (c == x && d == y) System.out.println("0 (" + c + " " + d + ") ");
            else {
                res1[0] = c; res2[0] = d;
                Try(1);
                System.out.print(res + " ");
                for (int i = 0; i < res; i++) {
                    System.out.print("(" + res1[i] + " " + res2[i] + ") ");
                }
                System.out.print("(" + x + " " + y + ") ");
            }
        }
    }
}