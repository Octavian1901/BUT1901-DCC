import java.util.Scanner;

public class CthirdEx {
    public static void run () {
        System.out.println("Третье задание");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int number = scanner.nextInt(); //считываем число
        if (number > 0) number++; //если число положительное прибавляем 1
        System.out.println(number);
    }

}
