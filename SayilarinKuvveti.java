import java.util.Scanner;

public class SayilarinKuvveti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Lütfen sayı giriniz :");
        n = input.nextInt();
        System.out.println("4'ün katları:");
            for ( int i =1; i<=n; i*=4){
                System.out.println(i);
            }
        System.out.println("5'ün katları:");
            for ( int i =1; i<=n; i*=5){
                System.out.print(i);
        }



    }

}
