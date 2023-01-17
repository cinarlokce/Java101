import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\nSeçiminiz:");
        int key=sc.nextInt();

        System.out.print("İşlem yapmak istediğiniz 1. sayıyı giriniz:");
        double d1=sc.nextDouble();

        System.out.print("İşlem yapmak istediğiniz 2. sayıyı giriniz:");
        double d2=sc.nextDouble();

        switch (key) {
            case(1):
                System.out.println("İşleminizin Sonucu:"+(d1+d2));
                break;
            case(2):
                System.out.println("İşleminizin Sonucu:"+(d1-d2));
                break;
            case(3):
                System.out.println("İşleminizin Sonucu:"+(d1*d2));
                break;
            case(4):
                System.out.println("İşleminizin Sonucu:"+(d1/d2));
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
                break;
        }
    }
}
