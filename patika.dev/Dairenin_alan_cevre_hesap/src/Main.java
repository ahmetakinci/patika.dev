import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        int r ;

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = scanner.nextInt();

        System.out.println("Dairenin alanı: " + r*r*pi);
        System.out.println("Dairenin çevresi: " + 2*pi*r);

    }
}
