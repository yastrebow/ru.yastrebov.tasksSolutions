import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
//Напишите калькулятор. Используйте Scanner и if.
//а) Пусть человек вводит одно число, вводит второе и затем вводит символ '+', '-', '*' или '/'.
// В зависимости от символа выведите на экран результат выполнения арифметической операции.
//
//б) С получившимся ответом предложите выполнить ещё одну операцию
// и уже нужно будет ввести символ операции и одно число и применить операцию к результату выполнения прошлой операции.
// Так сделайте 4 раза.
//
//в) Добавьте возможность - если человек на любом этапе введёт символ 'q', то завершите программу на этом месте.
// Это опциональная, дополнительная задача. Вам поможет слово return - его можно написать внутри любого if и вообще в любом месте,
// и тогда текущая функция, то есть main, сразу завершится.
//
//г) Дополнительная задача - Прочитайте в интернете, как работает функция hasNextInt класса Scanner,
// и с её помощью сделайте так, чтобы программа не падала, даже если пользователь вводит не число, а какое-то слово.
// Умение находить информацию в интернете – такое же важное, как и умение писать код. Читайте форумы, книги, документацию, help и так далее.

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int result = 0;
        int result1 = 0;
        System.out.println("Введите 1-е число");
        x = scan.nextInt();

        System.out.println("Введите 2-е число");
        y = scan.nextInt();

        System.out.println("Введите действие '+', '-', '*' или '/'");
        char action = (char) System.in.read();

        if (action == '+') {
            result = x + y;
//            System.out.println(result);
        } else if (action == '-') {
            result = x - y;
//            System.out.println(result);
        } else if (action == '*') {
            result = x * y;
//            System.out.println(result);
        } else if (action == '/') {
            result = x / y;
//            System.out.println(result);
        } else {
            System.out.println("You choiced wrong action! Try again!");
        }
        System.out.println(result);

        System.out.println("Хотите выполнить какую-нибудь операцию с результатом вычислений? Нажмите Y или N");
        char newOperation = (char) System.in.read();

           

        if (newOperation == 'Y') {
            System.out.println("Введите число");
            int z = scan.nextInt();

            System.out.println("Введите действие '+', '-', '*' или '/'");
            char newAction = (char) System.in.read();

            if (newAction == '+') {
                result1 = result + z;
//            System.out.println(result1);
            } else if (newAction == '-') {
                result1 = result - z;
//            System.out.println(result1);
            } else if (newAction == '*') {
                result1 = result * z;
//            System.out.println(result1);
            } else if (newAction == '/') {
                result1 = result / z;
//            System.out.println(result1);
            } else {
                System.out.println("You choiced wrong action! Try again!");
            }
        }
        else {
            System.out.println("Ok. May be next time! Bye!");

        }
    }
}
