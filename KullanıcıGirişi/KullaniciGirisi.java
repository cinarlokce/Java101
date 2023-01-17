import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:");
        username = sc.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

            String cevap = sc.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                String newPassword = sc.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.Yeni şifreniz:" + newPassword);
                }
            }
        }
    }
}