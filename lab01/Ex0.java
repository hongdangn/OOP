package lab01;
import javax.swing.JOptionPane;

public class Ex0{
    public static void main (String[] args){
        String num1, num2;
        String strNoti = "U've just entered: ";
        
        num1 = JOptionPane.showInputDialog(null, "input the first number: "); 
        strNoti += num1 + " and "; 
        num2 = JOptionPane.showInputDialog(null, "input the second number: ");
        strNoti += num2;
        JOptionPane.showMessageDialog(null, strNoti);
        System.exit(0);
    }
}