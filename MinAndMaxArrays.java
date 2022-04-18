import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class MinAndMaxArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int[] list2 = list;
        Arrays.sort(list2);
        int min=0, max=0;

        System.out.print("Lütfen sayı giriniz: ");
        int a = input.nextInt();
        
        for(int i : list2){
            if (i<a){
                min=i;
            }
            if(i>a){
                max=i;
                break;
            }
        }
        System.out.println("En yakın büyük sayı: "+max);
        System.out.print("En yakın küçük sayı: "+min);

    }
    }

