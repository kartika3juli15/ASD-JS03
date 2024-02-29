import java.util.Scanner;
public class percobaan2{
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in); 
        persegiPanjang17[] arrayOfPersegiPanjang = new persegiPanjang17[3];

        for(int i = 0; i < 3; i++){
            arrayOfPersegiPanjang[i] = new persegiPanjang17();
        

        System.out.println("persegi panjang ke-" + (i+1));
        System.out.println("masukkan panjang : ");
        arrayOfPersegiPanjang[i].panjang = sc17.nextInt();
        System.out.println("masukkan lebar : ");
        arrayOfPersegiPanjang[i].lebar = sc17.nextInt();
        System.out.println();
        }
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){
            System.out.println("persegi panjang ke-" + (i+1));
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println();   
        }
    } 
    }