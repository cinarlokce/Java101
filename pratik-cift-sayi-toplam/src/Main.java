import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0,counter=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        k=input.nextInt();
        for(int i=1;i<=k;i++){
            if(i%3==0 && i%4==0){
                toplam += i;
                counter++;
            }
        }
        float ortalama=toplam/counter;
        System.out.println("Ortalama: "+ortalama);
    }
}