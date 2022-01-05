import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {

        int a, b;
        double c, u, alan;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz :");
        a = girdi.nextInt();

        System.out.print("2. Kenarı Giriniz :");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        u = (a + b + c)/2;
        alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));

        System.out.println("Hipotenüs :" + c);
        System.out.println("Üçgenin Çevresi :" + u);
        System.out.print("Üçgenin Alanı : " + alan);
    }
}

