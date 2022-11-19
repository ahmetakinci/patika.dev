import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.print("Bir Sayı Giriniz: ");
        a = scanner.nextInt();

        System.out.println("Sayıya kadar olan 4 ün kuvvetleri...");
        for (int i = 1; i <= a; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Sayıya kadar olan 5 in kuvvetleri...");
        for (int i = 1; i <= a; i *= 5) {
            System.out.println(i);
        }
    }
}
