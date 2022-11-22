package bebas.aja.gui;

import javax.swing.*;

public class RunFormSederhana {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Register");
        jFrame.setContentPane(new FormSederhana().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
