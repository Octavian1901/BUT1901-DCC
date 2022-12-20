import java.util.Arrays;
public class JtenEx {
    public static void run() {
        System.out.println("Десятое задание ");
        int intArray[] = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int[] resultArray = new int[intArray.length];
        int zeroNumbers = 0;
        int index = 0;
        for (int i = 0; i < intArray.length; i++) { //цикл, типа фильтра, убираем из массива все нули
            if (intArray[i] == 0) zeroNumbers++; //считаем количество нулей в массиве
            else { //если не ноль
                resultArray[index] = intArray[i]; //записываем как есть в итоговый массива
                index++;
            }
        }

        for (int i = 0; i < zeroNumbers; i++) { //цикл замены последних значений массива на нули
            resultArray[index] = 0; //Заменяем на нули
            index++;
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
