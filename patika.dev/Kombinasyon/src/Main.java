import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, r;
        double combination = 0, total1 = 1, total2 = 1, total3 = 1;

        System.out.print("Birinci sayıyı giriniz: ");
        n = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }
        System.out.println(n + " Sayısının Faktoriyeli: " + total1);

        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }
        System.out.println(r + " Sayısının Faktoriyeli: " + total2);
        for (int k = 1; k <= (n - r); k++) {
            total3 *= k;
        }

        combination = total1 / (total2 * total3);
        System.out.println("Sayıların kombinasyonu: " + combination);
    }
}
