import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yas, km, yon;
        double indirim =0, yasİndirimi, yonİnd ;
        boolean isEror = false;

        System.out.print("KM'yi giriniz :");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz :");
        yas = input.nextInt();
        System.out.print("Tek yön için 1\nGidiş Dönüş için 2\nYolculuk türünü seçiniz :");
        yon = input.nextInt();


        if (yas > 0 && km > 0 && ((yon == 1) || (yon == 2))) {
                if (yas <= 12) {
                    indirim = 0.50;
                } else if ((yas <= 24) && (yas > 12)) {
                    indirim = 0.10;
                } else if (yas <= 65) {
                    indirim = 0.30;
                } else
                    indirim = 0;
            } else
                isEror = true;


        if  (yon == 2) {
            yonİnd = 0.20;
        } else
            yonİnd = 0;

        double tutar = km * 0.10;
        yasİndirimi = tutar * indirim;
        double indirimlitutar = tutar - yasİndirimi;
        double yonIndirimi = indirimlitutar * yonİnd;
        double toptutar = (indirimlitutar - yonIndirimi) * yon;

        if (isEror == true) {
            System.out.print("Hatalı Giriş Yaptınız !");
        } else
            System.out.print("Toplam tutar:" + toptutar);


    }
}
