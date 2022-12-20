import java.util.Scanner;

public class GsevenEx {
    public static void run() {
        System.out.println("Седьмое задание ");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int code = scanner.nextInt();
        switch (code) {
            case 905:
                System.out.println("Москва. Стоимость разговора 41.5 рублей");
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора 19.8 рублей");
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора 26.9 рублей");
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора 50.0 рублей");
                break;
        }
    }

}
