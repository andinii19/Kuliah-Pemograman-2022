import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FormATM {
    private JTextField textNK;
    private JComboBox cbATM;
    private JComboBox cbBank;
    private JTextField textNama;
    private JButton saveButton;
    private JButton fileButton;
    private JTextArea textHasil;
    private JPanel rootPanel;
    private JLabel JImage;
    private JTextField textImage;


    public FormATM() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nokartu = textNK.getText();
                String jenisATM = (String) cbATM.getSelectedItem();
                String BANK = (String) cbBank.getSelectedItem();
                String Nama = textNama.getText();
                String file = textImage.getText();

                String hasil = "\nNomor Kartu : " +nokartu +"\nJenis ATM : " +jenisATM +"\nBANK : " +BANK +"\nNama Pemilik : " +Nama +"\nFile Name : " +file;

                //menampilkan di textArea
                JOptionPane.showMessageDialog(null, "Saved!");
                textHasil.append(hasil);


                try {
                    FileWriter myWriter = new FileWriter("FileDataBase.txt", true);
                    myWriter.write(hasil);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                    ex.printStackTrace();
                }
            }
        });
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser browseImage = new JFileChooser();

                int showOpenDialogue = browseImage.showOpenDialog(null);

                if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
                    File selectedImage = browseImage.getSelectedFile();
                    String selectedImagePath = selectedImage.getAbsolutePath();
                    String selectedImagePath2 = selectedImage.getName();

                    textImage.setText(selectedImagePath2);

                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(JImage.getWidth(), JImage.getHeight(), Image.SCALE_SMOOTH);

                    JImage.setIcon(new ImageIcon(image));
                }

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
