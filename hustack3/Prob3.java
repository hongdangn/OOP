import java.lang.*;
import java.io.*;
import java.util.*;

public class Prob3 {
    static int n;
    static int[] a = new int[1050];
    
    static void addlast(int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) return;
        }

        a[n] = key;
        n += 1;
    }

    static void addfirst(int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) return;
        }

        for (int i = n; i >= 1; i--) {
            a[i] = a[i - 1];
        }
        a[0] = key;
        n += 1;
    }

    static void addafter(int u, int v) {
        for (int i = 0; i < n; i++) {
            if (a[i] == u) return;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == v) {
                for (int j = n; j >= i + 2; j--) {
                    a[j] = a[j - 1];
                }
                a[i + 1] = u;
                n += 1;
                return;
            }
        }
    }

    static void addbefore(int u, int v) {
        for (int i = 0; i < n; i++) {
            if (a[i] == u) return;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == v) {
                for (int j = n; j >= i + 1; j--) {
                    a[j] = a[j - 1];
                }
                a[i] = u;
                n += 1;
                return;
            }
        }
    }

    static void removeElement(int key) {
        int[] b = new int[n];
        int dem1 = -1, dem2 = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                a[i] = -1000001;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != -1000001) {
                b[++dem1] = a[i];
            } 
        }

        for (int i = 0; i <= dem1; i++) {
            a[++dem2] = b[i];
        }
        n = dem1 + 1;
        return;
    }

    static void reverse() {
        int[] b = new int[n];
        int dem = -1;
        for (int i = n - 1; i >= 0; i--) {
            b[++dem] = a[i];
        }
        for (int i = 0; i < n; i++) a[i] = b[i];
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        String[] inp = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inp[i]);
        }

        while (true) {
            String[] input = bf.readLine().split(" ");
            if (input[0].equalsIgnoreCase("addlast")) {
                int key = Integer.parseInt(input[1]);
                addlast(key);
            } else if (input[0].equalsIgnoreCase("addfirst")) {
                int key = Integer.parseInt(input[1]);
                addfirst(key);
            } else if (input[0].equalsIgnoreCase("addafter")) {
                int u = Integer.parseInt(input[1]);
                int v = Integer.parseInt(input[2]);
                addafter(u, v);
            } else if (input[0].equalsIgnoreCase("addbefore")) {
                int u = Integer.parseInt(input[1]);
                int v = Integer.parseInt(input[2]);
                addbefore(u, v);
            } else if (input[0].equalsIgnoreCase("remove")) {
                int key = Integer.parseInt(input[1]);
                removeElement(key);
            } else if (input[0].equalsIgnoreCase("reverse")) {
                reverse();
            } else {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}