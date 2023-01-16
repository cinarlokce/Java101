import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdvOrani=0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV\'sini hesaplamak istediğiniz fiyatı giriniz:\t");
        double hamFiyat= input.nextDouble();

        double kdvTutari=hamFiyat*kdvOrani;
        double sonFiyat=hamFiyat+kdvTutari;
        System.out.println("KDV Oranı:%"+(kdvOrani*100)+"\nÜrünün ham fiyatı:"+hamFiyat+"\nÜrünün KDV Tutarı:"+kdvTutari+"\nÜrünün KDV\'li Fiyatı:"+sonFiyat);

    }
}
