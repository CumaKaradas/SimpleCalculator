import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;

        // İşlemi yapma
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata! Sıfıra bölme hatası.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
