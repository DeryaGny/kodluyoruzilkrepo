import java.util.Scanner;

public class TekSayiHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, toplam=0;

        do {
            System.out.print("Sayı giriniz:");
            n = input.nextInt();
                if ((n % 4 == 0) && (n % 2 == 0)){
                    toplam +=n;
                }
        }while (n %2 ==0);

        System.out.print("Sayılar toplamı :" +toplam);
    }

}
