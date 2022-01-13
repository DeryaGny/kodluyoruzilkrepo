import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, k;
        int total=1 ;
        System.out.print("Lütfen sayı giriniz :");
        n = input.nextInt();
        System.out.println("Üssü'nü giriniz :");
        k = input.nextInt();
            for ( int i =1; i<=k; i++){
                total *= n;
            }
        System.out.println("Sonuç :" +total);

        }



    }


