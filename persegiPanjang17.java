import java.util.Scanner;
public class persegiPanjang17{
    public int panjang;
    public int lebar;

  public void cetakInfo() {
    System.out.println("============================================");
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: "+ lebar);
    System.out.println("luas : " + hitungLuas(panjang, lebar));
    System.out.println("keliling: " + hitungKeliling(panjang, lebar));
}

 public persegiPanjang17(int p, int l){
    this.panjang = p;
    this.lebar = l;
}

public int hitungLuas(int p, int l){
    return p*l; 
}

public int hitungKeliling(int p, int l){
    return (p*2) + (l*2); 
}
}