package com.company;

import java.util.HashMap;
import java.util.Map;

class lab3 {
    public static void main(String[] arg) {

        //1. Написать программу, которая проверяет, является ли строка палиндромом

        //Метод str.equals используется для сравнения строк
        //Метод StringBuilder(str).reverse().toString() переворачивает строку

        System.out.println(" 1");
        String str = "заказ";
        System.out.println("Введенная строка " + str);
        if (str.equals((new StringBuffer(str)).reverse().toString())) {
            System.out.println("Введенная строка палиндром");
        } else
            System.out.println("Введенная строка не является палиндромом");

        //2. Реализовать удаление повторяющихся символов в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент
        // может быть найден в массиве или -1, если такого индекса нет.

        //Метод charAt() возвращает указанный символ из строки.

        //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
        // на котором он был вызван, или -1,
        // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

        System.out.println(" 2");
        String two = "пррироода";
        String result = "";
        for (int i = 0; i < two.length(); i++) {
            if (two.indexOf(two.charAt(i)) == two.lastIndexOf(two.charAt(i))) {
                result += two.charAt(i);
            }
        }

        System.out.println(result);

        //3. Реализовать проверку, являются ли две строки анаграммами

        System.out.println(" 3");
        String str1 = "дома";
        String str2 = "мода";
        System.out.println("1: " + str1 + " " + "2: " + str2);
        if (str1.length() != str2.length()) { //если не равны по длине
            System.out.println("не анаграммы");
        } else {
            StringBuilder s1 = new StringBuilder(str1.toLowerCase());
            StringBuilder s2 = new StringBuilder(str2.toLowerCase());
            int x, y;
            x = -1;
            while (++x < s1.length()) {
                y = -1;
                while (++y < s2.length()) {
                    if (s1.charAt(x) == s2.charAt(y)) {
                        s2.deleteCharAt(y);
                    }
                }
            }
            System.out.println("анаграммы");
        }

        //4. Напишите Java-программу для лексикографического сравнения двух строк

        //Метод compareTo() в Java структурирован двумя вариантами.
        // Первый: метод сравнивает строку с другим объектом,
        // а второй: метод лексически сравнивает две строки.

        //В Java compareTo() получает значение 0, если аргумент является строкой лексически равной данной строке; значение меньше 0,
        // если аргумент является строкой лексически большей, чем сравниваемая строка; и значение больше 0,
        // если аргумент является строкой лексически меньшей этой строки.

        System.out.println(" 4");
        String w1 = "БУТ";
        String w2 = "бут";
        System.out.println(w1.compareTo(w2));

        //5. Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре

        //compareToIgnoreCase() возвращает отрицательное целое число, ноль или положительное целое число,
        // если заданная строка меньше, равна или больше сравниваемой строки, игнорируя регистр

        System.out.println(" 5");
        String w3 = "БУТ";
        String w4 = "бут";
        System.out.println(w3.compareToIgnoreCase(w4));

        //6. Напишите программу на Java для объединения данной строки в конец другой строки

        System.out.println(" 6");
        String w5 = "да";
        String w6 = " пого";
        System.out.println(w6 + " " + w5);

        //7. Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов

        //Метод contentEquals() – возвращает значение true только в том случае, если эта строка представляет собой ту же
        // последовательность символов, которая указана в строке буфера (StringBuffer).

        System.out.println(" 7");
        String w7 = "студент";
        CharSequence w71 = "студентка";
        if (w7.contentEquals(w71) == true) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки различны");
        }

        //8. Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки

        //Метод endsWith() позволяет определить, заканчивается ли строка символами указанными в скобках,
        // возвращая, соответственно, true или false.

        System.out.println(" 8");
        String w8 = "дождь";
        String w81 = "На улице сегодняя идёт дождь";
        System.out.println(w81.endsWith(w8));

        //9.Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные

        System.out.println(" 9");
        String w9 = "дорога";
        String w91 = "города";
        System.out.println(w9.equals(w91));

        //10. Напишите Java-программу, чтобы получить длину заданной строки

        System.out.println(" 10");
        String w10 = "джава";
        System.out.println("Длина строки: " + w10.length());

        //11. Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр

        System.out.println(" 11");
        String w11 = "ПоГоДа";
        System.out.println(w11.toLowerCase());

        //12. Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр

        System.out.println(" 12");
        System.out.println(w11.toUpperCase());

        //13. Напишите программу на Java, чтобы найти второй по частоте символ в данной строке

        System.out.println(" 13");
        Map<String, Integer> letters = new HashMap<String, Integer>();

        //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
        // если такого индекса нет.

        //берется каждый символ, затем считается кол-во повторений этого символа
        String words = "бутт";
        int wordLen = words.length();
        int countLetter = 0;
        for (int i = 0; i < wordLen; ) {
            int count = 0;
            char t = words.charAt(i);
            int index = i;
            boolean b = true;
            while (b) {
                if (words.indexOf(t, index) != -1) {
                    count++;
                    index++;
                } else {
                    b = false;
                    i = index;
                }
            }
            letters.put(Character.toString(t), count);//запись в формате "значение:кол-во повторений"
        }

        //keySet(): возвращает набор всех ключей отображения

        //находим самое большое кол-во повторений
        String maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }

        //Удаляется символ, встречающийся больше всех
        ////находим самое большое кол-во повторений (второй по частоте символ)
        letters.remove(maxKey);
        maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        System.out.println(maxKey);

        //14. Напишите программу на Java для печати после удаления дубликатов из заданной строки

        //For-each — это разновидность цикла for, которая используется, когда нужно обработать все элементы массива или коллекции.

        //Метод append() – обновляет значение объекта, который вызвал метод.

        System.out.println(" 14");
        String a = "буут";
        int len;
        do {
            len = a.length();
            a = a.replaceAll("([^a-z])\\1", "");


        }
        while (len != a.length());
        System.out.println(a);


        //15. Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент
        // может быть найден в массиве или -1, если такого индекса нет.

        //Метод charAt() возвращает указанный символ из строки.

        //Метод lastIndexOf() возвращает индекс последнего вхождения указанного значения в строковый объект String,
        // на котором он был вызван, или -1,
        // если ничего не было найдено. Поиск по строке ведётся от конца к началу, начиная с индекса fromIndex.

        System.out.println(" 15");
        String str12 = "ббуут";
        boolean f = true;
        for (int i = 0; i < str12.length() && f; i++) {
            //если индексы равны -> первый неповторяющийся символ в строке
            if (str12.indexOf(str12.charAt(i)) == str12.lastIndexOf(str12.charAt(i))) {
                System.out.print(str12.charAt(i));
                f = false;
            }
        }
        System.out.println();

        //16. Напишите программу на Java, которая возвращает true из заданной строки, если первые два символа в строке также появляются в конце

        //Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
        // Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.

        System.out.println(" 16");
        String w16 = "бутбу";
        String begin = (w16.substring(0, 2)).toLowerCase();//первые 2
        String end = (w16.substring(w16.length() - 2)).toLowerCase();//вторые 2
        System.out.println(begin.equals(end));


        //17. Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке

        //Метод indexOf() возвращает первый индекс, по которому данный элемент может быть найден в массиве или -1,
        // если такого индекса нет.
        //берется каждый символ, затем считается кол-во повторений этого символа

        System.out.println(" 17");
        String w17 = "бббуууттт";
        int len17 = w17.length();
        int countW = 0;
        for (int i = 0; i < len17; ) {
            int countN = 0;
            char t1 = w17.charAt(i);
            int index = i;
            boolean b1 = true;
            while (b1) {
                if (w17.indexOf(t1, index) != -1) {
                    countN++;
                    index++;
                } else {
                    b1 = false;
                    i = index;
                }
            }
            if (countN == 3) {//Если 3 повторения
                countW++;
            }
        }
        //String prev = null;
        System.out.println(countW);

        //18. Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0

        System.out.println(" 18");
        String w18 = "б1у2т3";
        //отбор с помощью регулярных выражений
        w18 = w18.replaceAll("[^0-9]", "");
        if (w18.isEmpty()) {
            System.out.println("сумма = 0");
        } else {
            int sum = 0;
            boolean b2 = true;
            int num = Integer.parseInt(w18);
            //System.out.println(w18);
            while (b2) {
                sum += num % 10;//деление с остатком (остаток)
                num /= 10; // 3 + 2 + 1
                if (num <= 0) {
                    b2 = false;
                }
            }
            System.out.println(sum);
        }
    }
}