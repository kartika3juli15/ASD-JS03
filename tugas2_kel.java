import java.util.Scanner;

public class tugas2_kel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi objek pengguna
        System.out.print("Masukkan username pengguna: ");
        String usernamePengguna = sc.nextLine();
        System.out.print("Masukkan PIN pengguna: ");
        String pinPengguna = sc.nextLine();
        System.out.print("Masukkan umur pengguna: ");
        int umurPengguna = sc.nextInt();
        Pengguna pengguna = new Pengguna(usernamePengguna, pinPengguna, umurPengguna);
        pengguna.pilihFilm("avenger");
        pengguna.pilihSeat(23);
        pengguna.pilihMakanan("popcorn");
        pengguna.menjadiMember();

    }
}
