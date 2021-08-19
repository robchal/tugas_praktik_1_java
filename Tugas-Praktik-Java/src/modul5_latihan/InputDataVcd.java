package modul5_latihan;

import java.util.Scanner;

public class InputDataVcd extends RentalVcd{
    private String[][] dataFilm = new String[10][6];
    private String[][] initlize = {{"Harry Potter", "Daniel Radcliff", "Stephen Spielberg", "Max Cinema", "SU", "120"},
            {"Avengers", "Chris Evan", "Conor Mcgregor", "Disney", "SU", "190"}};

    public void initData() {
        for(var i = 0; i < dataFilm.length; i++) {
            if(i < 2) {
                for(var j = 0; j < initlize[i].length; j++) {
                    dataFilm[i][j] = initlize[i][j];
                }
            }else {
                for(var s = 0; s < initlize[0].length; s++) {
                    dataFilm[i][s] = "zero";
                }
            }
        }
    }

    public void mauApa() {
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Mau ngapain (tambah data / liat daftar )? ");
        var confirm = userInput.next();
        if(confirm.equals("tambah data")) {
            tambahData();
        }else if(confirm.equals("liat daftar")){
            movieList();
        }else {
            mauApa();
        }

    }
    public void tambahData() {
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukan Judul Film : ");
        String judul = userInput.next();
        setJudul(judul);
        System.out.print("Masukan Nama Aktor : ");
        String aktor = userInput.next();
        setAktor(aktor);
        System.out.print("Masukan Nama Sutradara : ");
        String sutradara = userInput.next();
        setSutradar(sutradara);
        System.out.print("Masukan Nama Publisher : ");
        String publisher = userInput.next();
        setPublisher(publisher);
        System.out.print("Masukan Kategori(SU / D / R / A) : ");
        String kategori = userInput.next();
        setKategori(kategori);
        System.out.print("Masukan Jumlah Stok : ");
        String stok = userInput.next();
        setStok(stok);
        String[] hasil = {getJudul(), getAktor(), getSutradar(), getPublisher(), getKategori(), getStok()};
        for(var i = 0; i < 1; i++) {
            for(var j = 2; j < dataFilm.length; j++) {
                if(dataFilm[j-1][0].equals(hasil[0])) {
                    break;
                }
                for(var x = 0; x < dataFilm[j].length; x++) {
                    if(!dataFilm[j][x].equals("zero")) {
                        break;
                    }else {
                        dataFilm[j][x] = hasil[x];
                    }
                }
            }
        }
        movieList();
    }

    public void movieList() {
        for(var x = 0; x < dataFilm.length; x++) {
            if(dataFilm[x][0].equals("zero")) {
//                System.out.println("gak ada");
            }else {
                for(var z = 0; z < dataFilm[x].length; z++) {
                    System.out.print(dataFilm[x][z]);
                    System.out.print(" , ");
                    if(z == dataFilm[x].length-1) {
                        System.out.println("");
                    }
                }
            }
        }
    mauApa();
    }
}
