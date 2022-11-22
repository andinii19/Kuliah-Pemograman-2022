package bebas.aja.gui;

public class Registrasi {
    private String Nama;
    private String NIM;
    private String Jurusan;
    private String JenisKelamin;

    public Registrasi() {
    }

    public Registrasi(String nama, String NIM, String jurusan, String jenisKelamin) {
        Nama = nama;
        NIM = NIM;
        Jurusan = jurusan;
        JenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Registrasi Berhasil!!" +
                "\n"+
                "\nNama = " + Nama +
                " \nNIM = " + NIM  +
                " \nJurusan = " + Jurusan  +
                " \nJenis Kelamin = " + JenisKelamin  ;
    }
}
