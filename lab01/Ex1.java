package lab01;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Will you choose YES or NO?");
        String opt = (option == JOptionPane.YES_OPTION)? "YES" : "NO";
        JOptionPane.showMessageDialog(null, "You've chosen: " + opt);
        System.exit(0);
    }
}
