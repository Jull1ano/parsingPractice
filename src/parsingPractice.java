import javax.swing.*;
public class parsingPractice {
    public static void main(String[] args)
    {
        /*int num = 5;
        String word = "" + 5;
        System.out.println(num + 5);*/

        /*String word = "500";
        int num = Integer.parseInt(word);
        System.out.println(num + 5);*/

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
        System.out.println(num + 5);
    }
}
