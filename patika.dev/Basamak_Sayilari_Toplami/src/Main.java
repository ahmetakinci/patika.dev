import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, temp, result = 0;

        System.out.print("Bir sayı giriniz: ");
        a = scanner.nextInt();

        while (a != 0) {

            temp = a % 10;
            result += temp;
            a = a / 10;

        }
        System.out.println("Sayının rakamları toplamı: " + result);
    }
}
