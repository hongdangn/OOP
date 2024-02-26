public class ReverseInt{
    static int funcReverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int myOutput = 0;
        while (x != 0){
            int mod = x % 10;
            if (myOutput > max/10 || (myOutput == max/10 && mod > 7)) return 0;
            if (myOutput < min/10 || (myOutput == min/10 && mod < -8)) return 0;
            myOutput = myOutput * 10 + mod;
            x /= 10;
        }
        return myOutput;
    }
    public static void main(String[] args){
        System.out.println(funcReverse(123));
    }
}
