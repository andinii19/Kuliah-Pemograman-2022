package bebas.aja.gui;

import javax.swing.*;

public class RunFormData {
    public static void main(String[]args){
        JFrame jFrame = new JFrame("DATA");
        jFrame.setContentPane(new FormData().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
