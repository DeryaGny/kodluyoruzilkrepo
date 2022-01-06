import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayısyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1. Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Hangi İşlemi yapmak istiyorsunuz :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkanma :" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma :" + (n1 * n2));
                break;
            case 4: {
                if (n2 != 0) {
                    System.out.print("Bölme :" + (n1 / n2));
                }else {
                    System.out.print("Bir Sayı Sıfıra Bölünemez !");
                }break;
            }
            default:
                System.out.print("Hatalı Giriş Yaptınız");
        }

        }

    }

