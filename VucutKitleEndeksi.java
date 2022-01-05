import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        double kg, m;

        System.out.print("Lütfen kilonuzu giriniz :");
        kg = girdi.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m = girdi.nextDouble();

        double vki = kg / (m * m);

        System.out.println("Vücut Kitle İndeksiniz :" + vki );

    }
}
