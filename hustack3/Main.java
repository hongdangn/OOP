//JAVA 
import java.util.*; 
import java.io.*;
import java.lang.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class Main { 
    static int n;
    static int[] arr = new int[101];
    static int[] parenthesis = {1, 2};
    
    static void printResult() {
    	for (int i = 0; i < n; i++) {
    		System.out.print(arr[i]);
    	}
    	System.out.print(" ");
    }
    
    static int checkArray(int end) {
    	int tmp = 0;
    	for (int i = 0; i < end; i++) {
    		if (arr[i] == 1) tmp++;
    		else tmp--;
    		if (tmp < 0) return 0;
    	}
    	if (tmp > 0 && end == n) return 0;
    	return 1;
    }
    
    static void Try(int k, int lastZero) {
    	for (int i = 0; i < n; i++) {
    		if (arr[i] == 0) {
    			for (int j = 0; j < 2; j++) {
    				if (checkArray(i) != 0) {
    					arr[i] = parenthesis[j];
    					if (i == lastZero) {
    						if (checkArray(n) != 0) printResult();
    //						printResult();
    					}
    					else Try(k + 1, lastZero);
    					arr[i] = 0;
    				}
    			}
    			break;
    		}
    	}
    }
    public static void main(String[] args) throws IOException { 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        
    	String[] inp = bf.readLine().split(" ");
    	for (int i = 0; i < inp.length; i++) {
    	    arr[i] = Integer.parseInt(inp[i]); 
    	}
    	
    	int lastZero = -1;
    	for (int i = n - 1; i >= 0; i--) {
    		if (arr[i] == 0) {
    			lastZero = i;
    			break;
    		}
    	}
    	if (lastZero == -1 && checkArray(n) != 0) printResult();
    	Try(0, lastZero);
    }
}