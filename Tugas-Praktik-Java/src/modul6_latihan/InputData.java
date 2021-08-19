package modul6_latihan;

import java.util.Scanner;

public class InputData extends Datamhs {

    private String[][] datamhs = new String[1][4];

    public void tambahData() {
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukan NIM : ");
        String nim = userInput.next();
        setNim(nim);
        System.out.print("Masukan Nama Mahasiswa : ");
        String nama = userInput.next();
        setNama(nama);
        System.out.print("Masukan Alamat  : ");
        String alamat = userInput.next();
        setAlamat(alamat);
        System.out.print("Masukan Kode Jurusan(61 / 62 / 63 / 64 / 65 / 66) : ");
        String jurusan = userInput.next();
        var jrsBaru = kodeJurusan(jurusan);
        setJurusan(jrsBaru);
        String[] mhs = {getNim(), getNama(), getAlamat(),getJurusan()};
        for(var i = 0; i < 1; i++) {
            for(var j = 0; j < datamhs[i].length; j++) {
                    datamhs[i][j] = mhs[j];
            }
        }
        daftarMhs();
    }

    public String kodeJurusan(String kode) {
        if(kode.equals("61")) {
            return kode = "Matematika";
        }else if(kode.equals("62")) {
            return kode = "Biologi";
        }else if(kode.equals("63")) {
            return kode = "Kimia";
        }else if(kode.equals("64")) {
            return kode = "Fisika";
        }else if(kode.equals("65")) {
            return kode = "Teknik Informatika";
        }else if(kode.equals("6^")) {
            return kode = "Teknik Arsitektur";
        }else {
            return kode = "Salah Input";
        }
    }

    public void daftarMhs() {
        for(var i = 0; i < 1; i++ ) {
            for(var j = 0; j < datamhs[0].length; j++) {
                System.out.println(datamhs[0][j]);
            }
        }
        tambahData();
    }

}