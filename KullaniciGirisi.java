import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPasword;
        int select ;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı:");
        userName = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Başarılı");
        } else
            System.out.print("Giriş Başarısız ! ");
    }
    }
