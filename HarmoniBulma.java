import java.util.Scanner;

public class HarmoniBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int total=0 ;

        System.out.print("Lütfen sayı giriniz :");
        n = input.nextInt();


        for(double i=1; i<=n; i++ ){
            total += (1/i);
        }
        System.out.print(total);
        }



    }


