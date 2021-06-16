package Scanner;//Считайте с клавиатуры три дробных числа.
// Выведите их на экран в обратном порядке, при этом сделав их целыми, то есть отбросив дробную часть.

import java.util.Scanner;

public class FloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double double1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double double2 = scanner.nextDouble();
        System.out.println("Введите третье число");
        double double3 = scanner.nextDouble();

        System.out.println((int)double3);
        System.out.println((int)double2);
        System.out.println((int)double1);
    }
}
