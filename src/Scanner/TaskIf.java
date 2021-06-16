package Scanner;//Считайте целое число с клавиатуры и сохраните его в переменную x. Выполните распечатку, в случае если
//а) x равен 6 или 9
//б) x больше -20 и одновременно меньше 100
//в) x меньше 100 или больше 1000

import java.util.Scanner;

public class TaskIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Введите любое число");
        x = scanner.nextInt();
        if(x == 6 || x ==9){
            System.out.println(x);
        }

        System.out.println("Введите любое число");
        x = scanner.nextInt();
        if (x > -20 && x < 100){
            System.out.println(x);
        }

        System.out.println("Введите любое число");
        x = scanner.nextInt();
        if (x < 100 || x > 1000) {
            System.out.println(x);
        }
    }
}
