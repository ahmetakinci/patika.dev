import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        int ebob = 1, ekok;

        int i = 1;
        if (a <= b) {
            while (i <= a) {
                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= b) {
                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Sayıların EBOB'u: " + ebob);
        ekok = (a * b) / ebob;
        System.out.println("Sayıların EKOK'u: " + ekok);
    }
}
