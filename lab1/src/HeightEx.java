public class HeightEx {
    public static void run() {
        System.out.println("Восьмое задание ");
        int intArray[] = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};

        int max = intArray[0];
        int sumPol = 0;
        int sumChot = 0;
        int countPol = 0;

        int sumOtr = 0;
        int countOtr = 0;

        for(int i = 0; i < intArray.length; i++) {
            // Нахождение максимального
            if(intArray[i] > max)
                max = intArray[i];

            // Сумма положительных
            // Количество положительных
            if(intArray[i] > 0){
                sumPol += intArray[i];
                countPol++;
            }

            // Сумма чётных отрицательных
            if(intArray[i] < 0 && intArray[i] % 2 == 0)
                sumChot += intArray[i];

            // Среднее арифметическое
            //      Сумму отрицательных
            if(intArray[i] < 0) {
                sumOtr += intArray[i];
                countOtr++;
            }
        }

        System.out.println("Максимальное: " + max);
        System.out.println("Сумма положительных: " + sumPol);
        System.out.println("Сумма отрицательных чётных: " + sumChot);
        System.out.println("Кол-во положительных: " + countPol);
        System.out.println("Среднее арифметическое: " + sumOtr/countOtr);
    }
}
