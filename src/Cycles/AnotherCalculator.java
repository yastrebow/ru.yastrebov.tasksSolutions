package Cycles;

//Напишите калькулятор. Предложите пользователю ввести число, затем знак одной из арифметических операций +,-,*,/ .
// Введите ещё число, выполните операцию, распечатайте результат и предложите ввести новую.
// Если пользователь введёт q, то остановите программу.

import java.io.IOException;
import java.util.Scanner;

public class AnotherCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int result = 0;
        char action = 0;

            System.out.println("Введите число");
            if (scan.hasNextInt()) {
                x = scan.nextInt();
            }

            do {
                System.out.println("Введите действие '+', '-', '*' или '/'");
                action = (char) System.in.read();
                if (action == 'q') {
                    break;
                } else {
                    System.out.println("Введите число");
                    if (scan.hasNextInt()) {
                        y = scan.nextInt();
                        if (action == '+') {
                            result = x + y;
                        } else if (action == '-') {
                            result = x - y;
                        } else if (action == '*') {
                            result = x * y;
                        } else if (action == '/') {
                            result = x / y;
                        }
                        System.out.println(result);
                        x = result;
                    }
//                    else {
//                        System.out.println("Число - это нечто отличное от того, что вы ввели:(");
//                        break;
//                    }
                }
            }
        while (true);
    }
}
