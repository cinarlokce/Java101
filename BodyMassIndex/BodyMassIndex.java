import java.util.Scanner;

public class BodyMassIndex {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print(ANSI_RED + "L" + ANSI_RESET+"ütfen boyunuzu(metre cinsinde) giriniz:");
        double boy=input.nextDouble();

        System.out.print(ANSI_RED + "L" + ANSI_RESET+"ütfen kilonuzu giriniz:");
        double kilo=input.nextDouble();

        double bmi=kilo/(boy*boy);

        System.out.print(ANSI_RED + "V" + ANSI_RESET+"ücut Kitle İndeksiniz:"+bmi);
    }
}
