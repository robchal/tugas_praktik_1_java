package modul2_latihan;

public class MainStok {
    public static void main(String[] args) {
        //Stok bolpoint
        Stok bolpoint = new Stok();
        bolpoint.setAlatTulis("Bolpoint");
        bolpoint.setHarga(2000);
        bolpoint.setJumlahStok(10);
        bolpoint.setTotalHargaStok(bolpoint.getHarga() * bolpoint.getJumlahStok());

        //method result berfungsi menampilkan result ke console agar tidak perlu membuat kode berulang
        bolpoint.result();


        //Stok pensil
        Stok pensil = new Stok();
        pensil.setAlatTulis("Pensil");
        pensil.setHarga(1000);
        pensil.setJumlahStok(10);
        pensil.setTotalHargaStok(pensil.getHarga() * pensil.getJumlahStok());
        pensil.result();

        //Stok penghapus
        Stok penghapus = new Stok();
        penghapus.setAlatTulis("Penghapus");
        penghapus.setHarga(500);
        penghapus.setJumlahStok(10);
        penghapus.setTotalHargaStok(penghapus.getHarga() * penghapus.getJumlahStok());
        penghapus.result();

        //Total harga semua stok
        Stok total = new Stok();
        total.totalHarga(bolpoint.getTotalHargaStok(), pensil.getTotalHargaStok(), penghapus.getTotalHargaStok());



    }
}
