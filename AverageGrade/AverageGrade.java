import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Türkçe Notunuz:");
        int turkce=input.nextInt();

        System.out.print("Matematik Notunuz:");
        int mat=input.nextInt();

        System.out.print("Kimya Notunuz:");
        int kimya=input.nextInt();

        System.out.print("Fizik Notunuz:");
        int fizik=input.nextInt();

        System.out.print("Tarih Notunuz:");
        int tarih=input.nextInt();

        System.out.print("Müzik Notunuz:");
        int muzik=input.nextInt();

        int toplamNot=turkce+mat+kimya+fizik+tarih+muzik;
        double ortalamaNot=toplamNot/6.0;

        System.out.print("Ortalama notunuz,"+ortalamaNot+".");
    }
}
