import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
       Scanner girdi = new Scanner(System.in);

       double el= 3.67, ar= 2.14, dom = 1.11, muz = 0.95, pat=5, kg1, kg2, kg3, kg4, kg5;

       System.out.print("Armut Kaç kilo :");
       kg1 = girdi.nextDouble();

       System.out.print("Elma Kaç Kilo :");
       kg2 = girdi.nextDouble();

       System.out.print("Domates Kaç Kilo :");
       kg3 = girdi.nextDouble();

       System.out.print("Muz Kaç Kilo :");
       kg4 = girdi.nextDouble();

       System.out.print("Patlıcan Kaç Kilo :");
       kg5 = girdi.nextDouble();

       double tutar = (ar*kg1)+(el*kg2)+(dom*kg3)+(muz*kg4)+(pat*kg5);
       System.out.print("Toplam Tutar :" + tutar);
    }
}
