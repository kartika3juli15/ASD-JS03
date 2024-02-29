import java.util.Scanner;

public class mahasiswa17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        mahasiswa17_1[] arrayMahasiswa = new mahasiswa17_1[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Input data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc17.nextLine();
            System.out.print("NIM: ");
            String NIM = sc17.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = sc17.nextLine();
            System.out.print("IPK: ");
            double IPK = sc17.nextDouble();
            sc17.nextLine(); 
            System.out.println();

            arrayMahasiswa[i] = new mahasiswa17_1(nama, NIM, jenisKelamin, IPK);
        }

        System.out.println("Data Mahasiswa:");
        for (mahasiswa17_1 mahasiswa : arrayMahasiswa) {
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.NIM);
            System.out.println("Jenis Kelamin: " + mahasiswa.jenisKelamin);
            System.out.println("IPK: " + mahasiswa.IPK);
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIPK = 0;
        for (mahasiswa17_1 mahasiswa : arrayMahasiswa) {
            totalIPK += mahasiswa.IPK;
        }
        double rataRataIPK = totalIPK / arrayMahasiswa.length;

        System.out.println("Rata-rata IPK: " + rataRataIPK);
    }
}
