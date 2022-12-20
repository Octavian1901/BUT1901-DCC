import java.util.Scanner;

public class EfiveEx {
    public static void run() {
        System.out.println("Пятое задание ");
        Scanner scanner = new Scanner(System.in); // Используем его дня считывания с консоли
        int[] intArray = {
                scanner.nextInt(), // 0
                scanner.nextInt(), // 1
                scanner.nextInt()  // 2
        };

        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) //сравниваем числа между собой
                min = intArray[i]; //приравниваем наименьшее число
        }

        System.out.println(min);
    }

}
