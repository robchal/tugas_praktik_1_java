package modul5_latihan;

public class RentalVcd {
    private String judul;
    private String aktor;
    private String sutradar;
    private String publisher;
    private String kategori;
    private String stok;

    public String getJudul() {
        System.out.println(judul);
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getSutradar() {
        return sutradar;
    }

    public void setSutradar(String sutradar) {
        this.sutradar = sutradar;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        System.out.println(kategori);
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}
