import java.util.Scanner;

public class FsixEx {
    public static void run() {
        System.out.println("Шестое задание ");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Нулевое число ");
            return;
        }
        String result = "";
        boolean positive = number > 0; //положительное или отрицательное
        if(positive) {
            result += "Положительное";
        } else {
            result += "Отрицательное";
        }

        boolean chot = number % 2 == 0; //чётное или нечётное
        if(chot) {
            result += " чётное";
        } else {
            result += " нечётное";
        }
        result += " число";
        System.out.println(result);
    }
}
