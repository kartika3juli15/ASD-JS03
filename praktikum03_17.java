import java.util.Scanner;
public class praktikum03_17{
    public static void main(String[] args) {
    Scanner sc17 = new Scanner(System.in);
        persegiPanjang17[] arrayOfPersegiPanjang = new persegiPanjang17[3];
        
        int panjang, lebar;

        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc17.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc17.nextInt();
            System.out.println();
            arrayOfPersegiPanjang[i] = new persegiPanjang17(panjang, lebar); 
        }       
        for (int i = 0; i < 3; i++){
            arrayOfPersegiPanjang[i].cetakInfo();
        } 
    }
}


