class Film {
    String judul;
    String studio;
    String waktu;
    double hargaTiket;

    // Konstruktor
    public Film(String judul, String studio, String waktu, double hargaTiket) {
        this.judul = judul;
        this.studio = studio;
        this.waktu = waktu;
        this.hargaTiket = hargaTiket;
    }

    // Metode untuk menambah film
    public void tambahFilm(String judul, String studio, String waktu, double hargaTiket) {
        System.out.println("Film baru ditambahkan: " + judul);
    }

    // Metode untuk mengurangi film
    public void kurangiFilm(String judul) {
        System.out.println("Film dihapus: " + judul);
    }

    // Metode untuk mengubah harga tiket
    public void ubahHargaTiket(double hargaBaru) {
        this.hargaTiket = hargaBaru;
        System.out.println("Harga tiket diubah menjadi: " + hargaBaru);
    }

    // Metode untuk mengubah jam tayang
    public void ubahJamTayang(String jamBaru) {
        this.waktu = jamBaru;
        System.out.println("Jam tayang diubah menjadi: " + jamBaru);
    }
}

class Admin {
    String username;
    String PIN;

    // Konstruktor
    public Admin(String username, String PIN) {
        this.username = username;
        this.PIN = PIN;
    }

    // Metode untuk laporan data
    public void laporanData(int lapor, int hasil ) {
        // Implementasi laporan data
        System.out.println("Laporan data berhasil dibuat");
        System.out.println("masukkan penjualan : ");
        System.out.println("hari ke-1 : " + lapor);
        System.out.println("hari ke-2 : " + hasil);
    }  

    // Metode untuk mengecek anggota membership
    public void cekMembership(String usernamePengguna) {
        // Implementasi pengecekan membership
        System.out.println("Membership pengguna " + usernamePengguna + " telah dicek");
    }
}

class Pengguna {
    String username;
    String PIN;
    int umur;
    boolean memilikiMembership;

    // Konstruktor
    public Pengguna(String username, String PIN, int umur) {
        this.username = username;
        this.PIN = PIN;
        this.umur = umur;
        this.memilikiMembership = false; 
    }

    // Metode untuk memilih film
    public void pilihFilm(String judulFilm) {
        System.out.println("Pengguna " + username + " memilih film: " + judulFilm);
    }

    // Metode untuk memilih makanan
    public void pilihMakanan(String makanan) {
        System.out.println("Pengguna " + username + " memesan makanan: " + makanan);
    }

    // Metode untuk memilih seat
    public void pilihSeat(int nomorSeat) {
        System.out.println("Pengguna " + username + " memilih seat: " + nomorSeat);
    }

    // Metode untuk menjadi anggota membership
    public void menjadiMember() {
        memilikiMembership = true;
        System.out.println("Pengguna " + username + " menjadi anggota membership");
    }
}