import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

         int max=0, min=0;
       System.out.print("Kaç sayı gireceksiniz:");
       int n = input.nextInt();
       for (int i =1; i<=n; i++){
          System.out.print(i +". sayıyı giriniz :");
          int n1 = input.nextInt();
          if(i==1){
             min=n1;
             max=n1;
          }if (n1<min){
             min=n1;
          }if (n1>max){
             max=n1;
          }


       }System.out.print("En büyük sayı: "+max +"\nEn küçük sayı: "+min);





    }
    }

