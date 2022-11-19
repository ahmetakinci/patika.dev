import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, total = 0;
        do {
            System.out.print("Bir Sayı Giriniz: ");
            a = scanner.nextInt();

            if (a % 4 == 0) {
                total += a;
            }

        } while (a % 2 == 0);

        System.out.println("4'e Bölünen Sayıların Toplam: " + total);

    }
}
