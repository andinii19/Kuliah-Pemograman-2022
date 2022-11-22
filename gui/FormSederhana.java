package bebas.aja.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormSederhana {
    private JTextField textNama;
    private JLabel Nama;
    private JPanel rootPanel;
    private JLabel NIM;
    private JComboBox comboBoxJK;
    private JTextField textNIM;
    private JTextField textJurusan;
    private JButton simpanButton;
    private JButton keluarButton;


    public FormSederhana() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pengambilan data
                String Nama = textNama.getText();
                String NIM = textNIM.getText();
                String Jurusan = textJurusan.getText();
                String JenisKelamin = (String) comboBoxJK.getSelectedItem();

                //memanggil kelas registrasi
                Registrasi rgs = new Registrasi();
                rgs.setNama(Nama);
                rgs.setNIM(NIM);
                rgs.setJurusan(Jurusan);
                rgs.setJenisKelamin(JenisKelamin);
                //tampilkan output di FORM
                System.out.println(rgs.toString());
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Anda telah keluar");
            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }


}
