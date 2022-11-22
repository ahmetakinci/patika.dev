import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        int select;
        int price;
        int right = 3;
        String userName, password;

        while (right > 0) {

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = scanner.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            password = scanner.nextLine();

            if (userName.equals("ahmet") && password.equals("123")) {
                System.out.println("Bankamıza hoşgeldiniz...");
                System.out.println("---------------------------------------");
                System.out.println("""
                        1 - Bakiye Sorgulama
                        2 - Para Yatırma
                        3 - Para Çekme
                        4 - Çıkış""");
                System.out.println("---------------------------------------");

                do {
                    System.out.print("Yapmak istediğiniz işlemi tuşlayınız: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Bakiyeniz: " + balance + "TL");
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz para tutarını giriniz: ");
                            price = scanner.nextInt();
                            balance += price;
                            System.out.println(price + " TL bankanıza eklendi. Toplam bakiye " + balance + "TL");
                            break;
                        case 3:
                            System.out.print("Çekmek istediğiniz para tutarınız giriniz: ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Yeterli bakiye bulunamamaktadır. Bakiyeniz: " + balance + "TL");
                            } else {
                                balance -= price;
                                System.out.println(price + " TL değerinde para çektiniz. Toplam bakiye: " + balance + "TL");
                            }
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                    }
                }while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Kullanıcı adı ya da şifre hatalı");
                System.out.println("Kalan giriş hakkınız: " + right);
            }
        }
    }
}

