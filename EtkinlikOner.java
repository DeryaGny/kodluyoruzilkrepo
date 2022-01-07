import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int heat;
        System.out.print("Sıcaklık Değeri :");
        heat = girdi.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Piknik Yapabilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
        } else
            System.out.println("Yüzmeye gidebilirsiniz");
    }
}
