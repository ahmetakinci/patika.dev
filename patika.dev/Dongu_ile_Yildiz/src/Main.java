import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) {
            for (int t = 1; t <= a - i; t++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
