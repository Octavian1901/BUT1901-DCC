
public class InineEx {
    public static void run() {
        System.out.println("Девятое задание ");
        int[] A = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
            for (int i = A.length-1; i >= 0; i--) { //начинаем c последнего индекса массива к нулю
                System.out.print(A[i] + " "); //выводим значения в обратном порядке
            }
    }
}
