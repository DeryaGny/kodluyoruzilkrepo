import java.util.Scanner;

public class RecursivePower {

    static int ex( int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result *= a;
        }
    return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int b = input.nextInt();

        System.out.print("Sonuç: "+ex(a,b));

    }
}
