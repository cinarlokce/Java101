import java.util.Scanner;

public class DescendingSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;

            System.out.print("1. sayıyı(a) giriniz: ");
            a=sc.nextInt();

            System.out.print("2. sayıyı(b) giriniz: ");
            b=sc.nextInt();

            System.out.print("3. sayıyı(c) giriniz: ");
            c=sc.nextInt();

            if(a>b && a>c){
                if(b>c) System.out.println("a > b > c");
                else System.out.println("a > c > b");
            }
            else if (b>a && b>c) {
                if(a<c) System.out.println("b > c > a");
                else System.out.println("b > a > c");
            }

            else{
                if (b>a) System.out.println("c > b > a");
                else System.out.println("c > a > b");
            }

    }


    }

