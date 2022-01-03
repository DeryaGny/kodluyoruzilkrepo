import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Gİriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Gİriniz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = input.nextInt();

        System.out.print("tarih Notunuzu Giriniz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println(sonuc);

        String str = ((sonuc >= 60) ? "GEÇTİ" : "KALDI");
        System.out.print(str);

    }
}