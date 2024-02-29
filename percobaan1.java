import java.util.Scanner;
public class percobaan1{
    public static void main(String[] args) {
        persegiPanjang17[] arrayOfPersegiPanjang = new persegiPanjang17[3];

        arrayOfPersegiPanjang[0] = new persegiPanjang17();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;

        arrayOfPersegiPanjang[1] = new persegiPanjang17();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;
    
        arrayOfPersegiPanjang[2] = new persegiPanjang17();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;

        System.out.println("persegi panjang ke-1, panjang : " + arrayOfPersegiPanjang[0].panjang
        + ", lebar : " + arrayOfPersegiPanjang[0].lebar);
        System.out.println("persegi panjang ke-1, panjang : " + arrayOfPersegiPanjang[1].panjang
        + ", lebar : " + arrayOfPersegiPanjang[1].lebar);
        System.out.println("persegi panjang ke-1, panjang : " + arrayOfPersegiPanjang[2].panjang
        + ", lebar : " + arrayOfPersegiPanjang[2].lebar);
    }
}