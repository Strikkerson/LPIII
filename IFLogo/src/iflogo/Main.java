package iflogo;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        IFLogo iflogo = new IFLogo();
        iflogo.setVisible(true);
        iflogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iflogo.setSize(800, 700);
        
    }
}
