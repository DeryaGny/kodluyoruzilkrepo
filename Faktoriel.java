import java.util.Scanner;

public class Faktoriel {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyeldeğerigiriniz:");
        int n = inp.nextInt();
        int total =1;

        for(int i=1; i<=n; i++){
            total*=i;
        }
        System.out.print("sonuç: "+total);
        



    }
}
