import java.util.*; 

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt();
        int MOD = 1000000007;
        Integer[][] c = new Integer[k + 1][n + 1];
        
        if (k > n){
            System.out.println("0");
            return;
        }
        for (int i = 0; i <= n; i++){
            c[0][i] = 1;
            if (i <= k) c[i][i] = 1;
        }
        for (int i = 1; i <= k; i++){
            for (int j = i + 1; j <= n; j++){
                c[i][j] = (c[i][j - 1] % MOD + c[i - 1][j - 1] % MOD) % MOD;
            }
        }
        System.out.println(c[k][n]);
    }
}