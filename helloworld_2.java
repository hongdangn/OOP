public class helloworld_2 {
    static int firstMethod(int a, int b){
        return Math.max(a, b) * Math.min(a, b);
    }

    public static void main (String[] args){
        System.out.println(firstMethod(5, 15));
    }
}