import java.util.Scanner;

public class ManavKasa {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input=new Scanner(System.in);

        System.out.print(ANSI_RED + "Armut " + ANSI_RESET+"Kaç Kilo? :");
        double armutkg=input.nextDouble();

        System.out.print(ANSI_RED + "Elma " + ANSI_RESET+"Kaç Kilo? :");
        double elmakg=input.nextDouble();

        System.out.print(ANSI_RED + "Domates " + ANSI_RESET+"Kaç Kilo? :");
        double domateskg=input.nextDouble();

        System.out.print(ANSI_RED + "Muz " + ANSI_RESET+"Kaç Kilo? :");
        double muzkg=input.nextDouble();

        System.out.print(ANSI_RED + "Patlıcan " + ANSI_RESET+"Kaç Kilo? :");
        double patlicankg=input.nextDouble();

        double toplam=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
        System.out.print(ANSI_RED + "Toplam " + ANSI_RESET+"Tutar :"+toplam+" TL");

    }
}
