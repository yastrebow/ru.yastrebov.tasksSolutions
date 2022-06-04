package Functions;

//Сделайте функцию, которая рассчитывает заданную сумму типа 10+20+30+40.
// Сделайте так, чтобы её начальное значение было параметром и каждый раз слагаемое увеличивалось бы на 10.
// Количество слагаемых тоже может быть параметром. Используя эту функцию рассчитайте значение однотипных выражений:
//
//(10+20+30+40) + (100+ 110+120+130+140) + (220+230+240)
//
//То есть в нём будет три раза вызвана ваша функция с разными входящими параметрами (разное стартовое число
// и разное количество слагаемых).

import java.util.Scanner;

public class TripleFunction {
    static int sumOfBlock = 0;
    static int finalSum = 0;
    static int number = 0;
    static int terms = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А давайте-ка посчитаем сложную сумму");
        System.out.println("Введите количество блоков");
        int blocks = scanner.nextInt();

        for (int i = 0; i < blocks; i++) {
            System.out.println("Введите количество слагаемых в блоке");
            terms = scanner.nextInt();
            System.out.println("Введите стартовое число блока, кратное 10");
            number = scanner.nextInt();
            sumOfBlock = 0;
            for (int j = 0; j < terms; j++) {
             int num = number + j * 10;
               System.out.println(num);
                sumOfBlock += num;
            }
            System.out.println("Сумма блока = " + sumOfBlock);

            finalSum = finalSum + sumOfBlock;
    }
        System.out.println("Сумма всех блоков равна " + finalSum);
    }
}
