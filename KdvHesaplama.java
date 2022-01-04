import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double tutar, kdvOrani, kdvliTutar, kdvTutari, kdv2;

        System.out.print("Lütfen Tutarı Gİriniz: ");
        tutar = inp.nextInt();

        kdvOrani = (tutar>1000)? 1.18 : 0.18;
        kdvliTutar = tutar + kdvOrani;
        kdvTutari = tutar * kdvOrani;

        System.out.println("KDV Oranı :" + kdvOrani);
        System.out.println("KDVli Tutar :" +kdvliTutar);






    }
}
