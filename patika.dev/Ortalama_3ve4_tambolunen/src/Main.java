import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,toplam = 0,ortalama = 0,bolme = 0;

        System.out.print("Bir sayı giriniz: ");
        a = scanner.nextInt();

        for (int i = 1;i <= a; i++){
            if (i % 3 == 0 && i % 4 ==0){
                System.out.println(i);
                toplam += i;
                bolme++;
                ortalama = toplam / bolme;
            }
        }
        System.out.println("Sayıların ortalaması: " + ortalama);
    }
}
