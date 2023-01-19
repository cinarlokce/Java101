import java.util.Scanner;
public class EventSuggestion {
    public static void main(String[] args){
        int temperature;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature=sc.nextInt();

        if(temperature<=5) System.out.println("Kayak yapabilirsiniz.");
        if(temperature>5 && temperature<25) System.out.println("Sinemaya gidebilirsiniz.");
        if(temperature>=25 && temperature<=30) System.out.println("Pikniğe gidebilirsiniz.");
        if(temperature>30) System.out.println("Yüzmeye Gidebilirsiniz.");
    }
}
