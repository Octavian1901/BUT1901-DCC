import java.util.Scanner;

public class BsecondEx {
    public static  void run() {
        Scanner scan = new Scanner(System.in); // Используем его дня считывания с консоли
        System.out.println("Второе задание");
        System.out.println("Введите число: ");
        int number = scan.nextInt(); //считыванием число
        int sum = 0;  //переменная для результата
        if (number > 99 && number <= 999) {
            while (number > 0) { //цикл, пока число больше 0
                sum = sum + number % 10; //к сумме прибавляем остаток от деления на 10
                number = number / 10; //сокращаем на 10
            }
        } else {
            System.out.println("Недопустимый диапазон (от 100 до 999)");
        }
        System.out.println(sum);
    }
}
