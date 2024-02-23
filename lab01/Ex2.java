package lab01;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = sc.next();
        System.out.print("Your age? ");
        int age = sc.nextInt();
        System.out.println("Mr. " + name + ", " + "age: " + age + ", you're the best."); 
    }
}
