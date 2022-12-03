import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isPalindrom();
    }

    static void isPalindrom() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int a = scanner.nextInt();

        int temp = a, reverse_number = 0, last_number;

        while (temp != 0) {
            last_number = temp % 10;
            reverse_number = (reverse_number * 10) + last_number;
            temp /= 10;
        }

        if (reverse_number == a)
            System.out.println(a + " Sayısı Bir Polindrom Sayıdır");
        else
            System.out.println(a + " Sayısı Bir Polindrom Sayı Değildir");

    }
}