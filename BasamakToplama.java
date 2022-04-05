import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int toplam=0, adet=0;
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();

            while (a != 0){
            toplam = (a%10)+toplam;
            a/=10;
            ++adet;
        }
        System.out.print("basamak toplamı "+toplam);




    }
}
