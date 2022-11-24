package bebas.aja.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FormData {
    private JTextField textNama;
    private JLabel nama;
    private JTextField textTanggal;
    private JTextField textAlamat;
    private JLabel tanggal;
    private JPanel rootPanel;
    private JLabel alamat;
    private JButton buttonSimpan;
    private JLabel tersimpan;
    private JTextField textSaved;
    private JButton keluarButton;

    public FormData() {
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = textNama.getText();
                String tgl = textTanggal.getText();
                String alamat = textAlamat.getText();

                DATA d = new DATA();
                d.setNama(nama);
                d.setTanggalLahir(tgl);
                d.setAlamat(alamat);

                textSaved.setText(d.toString());

                String hasil = "\n\nNama : " +nama + "\nTanggal Lahir : " +tgl +"\nAlamat : " +alamat;

                try {
                    FileWriter myWriter = new FileWriter("HasilOutPut.txt", true);
                    myWriter.write(hasil);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ez) {
                    System.out.println("An error occurred.");
                    ez.printStackTrace();
                }
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Keluar");
                if(JOptionPane.showConfirmDialog(frame, "Tekan Yes Jika Ingin Keluar", "Keluar",
                        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
