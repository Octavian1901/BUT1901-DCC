import java.util.Scanner;

public class DfourEx {
    public static void run() {
        System.out.println("Четвёртое задание");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int number = scanner.nextInt();
        if (number > 0) number++; //если число положительное, то прибавляем 1
        else if (number < 0) number = number - 2; //если число отрицательное отнимаем 2
        else number = 10; //если нуливое, то выводим 10
        System.out.println(number);
    }
}
