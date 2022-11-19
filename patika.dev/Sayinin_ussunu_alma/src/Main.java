import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k, total = 1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Cevap: " + total);

    }
}
