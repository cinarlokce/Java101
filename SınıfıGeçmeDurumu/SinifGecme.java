import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int turkce,mat,fizik,kimya,muzik;
        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat=sc.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=sc.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=sc.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=sc.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=sc.nextInt();
        int dersSayisi=5;

        if(mat<0 || mat>100){
            dersSayisi-=1;
            mat=0;
        }
        if(turkce<0 || turkce>100){
            dersSayisi-=1;
            turkce=0;
        }
        if(fizik<0 || fizik>100){
            dersSayisi-=1;
            fizik=0;
        }
        if(kimya<0 || kimya>100){
            dersSayisi-=1;
            kimya=0;
        }
        if(muzik<0 || muzik>100){
            dersSayisi-=1;
            muzik=0;
        }

        int dersToplami=(mat+turkce+kimya+fizik+muzik);

        if(dersSayisi>0){
            double average=dersToplami/dersSayisi;
                if(average>=55){
                    System.out.println("Tebrikler, sınıfı geçtiniz !");
                }
                else System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.printf("Ortalamanız: %.2f",average);
        }
        else System.out.println("Yanlış Sayılar Girdiniz.");
    }

}
