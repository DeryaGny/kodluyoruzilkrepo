import java.util.Scanner;

public class AtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yil;

        System.out.print("Lütfen yıl giriniz:");
        yil = input.nextInt();

        if (yil%100 ==0){
            if (yil%400 == 0){
                System.out.print("Atık Yıl");
            }else
                System.out.print("Atık yıl değil");
        }else if (yil%4 ==0){
            System.out.print("Atık yıl");
        }else
            System.out.print("Atık yıl değil");


    }

}
