package Functions;

//Сделайте функцию, возвращающую максимум из трех чисел. Три числа идут параметрами, возвращается через return максимальное из них.
// В main вызовите эту функцию для разных входных параметров и проверьте, правильно ли она работает.

import java.util.Scanner;

public class FindMaximumTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует программа по определению максимального из трех чисел!");
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        System.out.println("Введите еще одно число");
        int y = scanner.nextInt();
        System.out.println("Введите третье число");
        int z = scanner.nextInt();

        int max = toFindMax(x, y, z);

        System.out.println("Максимальное из трех чисел: " + max);
    }

    public static int toFindMax (int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
