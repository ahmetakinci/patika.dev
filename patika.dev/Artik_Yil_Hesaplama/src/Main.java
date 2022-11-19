import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, remain_number;

        System.out.print("Bir yıl giriniz: ");
        year = scanner.nextInt();

        remain_number = year % 4;

        if (remain_number == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                } else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
