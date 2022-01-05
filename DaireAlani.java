import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        double pi = 3.15;
        int r, a;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz:");
        r = girdi.nextInt();

        System.out.print("Açıyı Giriniz:");
        a = girdi.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilim = (pi * (r*r)* a)/ 360;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre :" + cevre);
        System.out.print("Dilim Alanı:" + dilim);
    }
}
