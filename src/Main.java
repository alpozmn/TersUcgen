import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak Sayısı: ");
        int basamak = scanner.nextInt();

        // Ters üçgeni çiz
        for (int i = basamak; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 0; j < basamak - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geç
            System.out.println();
        }
    }
}
