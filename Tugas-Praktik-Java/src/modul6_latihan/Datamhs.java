package modul6_latihan;

public class Datamhs {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Datamhs() {

    }
    public Datamhs(String nim, String nama, String alamat, String jurusan){
        setNim(nim);
        setNama(nama);
        setAlamat(alamat);
        setJurusan(jurusan);
    }

    public String getNim() {
        System.out.println(nim);
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
