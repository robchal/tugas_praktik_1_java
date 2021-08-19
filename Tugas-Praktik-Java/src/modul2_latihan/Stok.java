package modul2_latihan;

public class Stok {
    private String alatTulis;
    private Integer harga;
    private Integer jumlahStok;

    private Integer totalHargaStok;

    public String getAlatTulis() {
        return alatTulis;
    }

    public void setAlatTulis(String alatTulis) {
        this.alatTulis = alatTulis;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(Integer jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public Integer getTotalHargaStok() {
        return totalHargaStok;
    }

    public void setTotalHargaStok(Integer totalHargaStok) {
        this.totalHargaStok = totalHargaStok;
    }

    public void result() {
        System.out.println("Nama Alat Tulis : " + getAlatTulis());
        System.out.println("Stok : " + getJumlahStok());
        System.out.println("Harga Satuan : " + getHarga());
        System.out.println("Harga Total " + getAlatTulis() + " : " + getTotalHargaStok());
        System.out.println("");
        System.out.println("");
    }

    public void totalHarga(Integer barang1, Integer barang2, Integer barang3) {
        System.out.println("Total harga semua stok : Rp. " + (barang1 + barang2 + barang3));
    }
}
