package Scanner;

import java.util.Scanner;

public class Lotery {

//    Напишите лотерею. Человек не знает, какие несколько конкретных чисел выигрышные,
//    и пробует ввести их наугад от 0 до 100.
//    Мы сообщаем о выигрыше, если введенное число равно
//    4, 10, 40 или 89. Напишите этот код с помощью пары операторов switch-case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 0 до 100");

        int x = 0;
        x = scanner.nextInt();
        switch (x) {
            case 4:
            System.out.println("You Win!!!");
                    break;
            case 10:
                System.out.println("You Win!!!");
                break;
            case 40:
                System.out.println("You Win!!!");
                break;
            case 89:
                System.out.println("You Win!!!");
                break;
            default:
                System.out.println("May be next time!");
                break;


        }

    }
}
