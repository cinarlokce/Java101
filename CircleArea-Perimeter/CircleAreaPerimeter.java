import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        double r=input.nextDouble();

        double Alan=Math.PI*r*r;
        double Cevre=2*Math.PI*r;

        System.out.println("Yarıçapını girdiğiniz dairenin alanı:"+Alan+"\nYarıçapını girdiğiniz dairenin çevresi:"+Cevre);
    }

}
