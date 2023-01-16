import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilecek KM'yi giriniz:");
        double km=input.nextDouble();

        double fiyat=10+(2.2*km);

        if (fiyat<20) fiyat=20;

        System.out.println("Taksimetrede yazan tutar:"+fiyat);
    }
}
