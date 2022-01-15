import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int n1, n2;

       System.out.print("1. sayıyı giriniz :");
       n1 = input.nextInt();
       System.out.print("2. sayıyı giriniz :");
       n2 = input.nextInt();

       int  ebob = 1;
       int ekok = 1;
       int i = n1;

       while(i > 1){
          if(n1 % i == 0 && n2 % i == 0){
             ebob = i;
             ekok = (n1*n2) / ebob;
             break;
          }
          i--;
       }
       System.out.println("EBOB: "+ ebob + " EKOK: "+ ekok);



    }
    }

