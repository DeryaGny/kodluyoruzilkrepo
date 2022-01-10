import java.util.Scanner;

public class CinBurcu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String burc;
        int tarih, olcu;

        System.out.print("Lütfen doğum yılınızı giriniz:");
        tarih = input.nextInt();
        olcu = tarih % 12;

        switch (olcu) {
            case 0 -> burc = "Maymun";
            case 1 -> burc = "horoz";
            case 2 -> burc = "Köpek";
            case 3 -> burc = "domuz";
            case 4 -> burc = "Fare";
            case 5 -> burc = "Öküz";
            case 6 -> burc = "Kaplam";
            case 7 -> burc = "Tavşan";
            case 8 -> burc = "Ejderha";
            case 9 -> burc = "Yılan";
            case 10 -> burc = "At";
            case 11 -> burc = "Koyun";
            default -> throw new IllegalStateException("Unexpected value: " + olcu);
        }

        System.out.print("Çin Yıl Burcunuz: " + burc);

    }
}
