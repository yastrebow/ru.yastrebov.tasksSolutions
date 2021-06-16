package Scanner;//Напишите программу - прообраз текстового редактора с подсчетом статистики.
// Пусть пользователь может вводить несколько строчек текста, к примеру пять штук.
// Программа должна вывести, сколько в тексте было всего символов во всех 5 строчках.
// Если пользователь на каком-либо этапе ввёл "quit", то программа должна завершиться на этом этапе. ОПЯТЬ НЕ РАБОТАЕТ!!!
// Вам поможет слово return - его можно написать внутри любого if и вообще в любом месте, и тогда текущая функция,
// то есть main, сразу завершится.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringStatistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какую-нибудь строку");
        String string1 = scanner.nextLine();
        System.out.println("Введите какую-нибудь строку");
        String string2 = scanner.nextLine();
        System.out.println("Введите какую-нибудь строку");
        String string3 = scanner.nextLine();
        System.out.println("Введите какую-нибудь строку");
        String string4 = scanner.nextLine();
        System.out.println("Введите какую-нибудь строку");
        String string5 = scanner.nextLine();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);

        String sumString = string1 + string2 + string3 + string4 + string5;
        int count = 0;
        for (int j = 0; j < sumString.length(); j++) {
            count++;
        }
        System.out.println(count);

        }
}
