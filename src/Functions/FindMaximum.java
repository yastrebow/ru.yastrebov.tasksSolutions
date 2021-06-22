package Functions;

//Сделайте функцию с двумя целыми параметрами, которая будет возвращать максимальное из этих двух чисел.
// Запустите её в main, сохраните результат её работы в переменную и выведите значение этой переменной на экран.
// Проверьте, что и в самом деле добывается максимум из двух чисел.

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует программа по определению максимального из двух чисел!");
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        System.out.println("Введите еще одно число");
        int y = scanner.nextInt();

        int max = toFindMax(x, y);

        System.out.println("Максимальное из двух чисел: " + max);
    }

    public static int toFindMax (int a, int b) {
        return Math.max(a, b);
    }
}

