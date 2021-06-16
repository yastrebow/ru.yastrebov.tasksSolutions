package Scanner;

import java.util.Scanner;

public class DoYouKnowMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет!");

        System.out.println("Сколько будет 25*5?");
        int x = 0;
        x = sc.nextInt();
        if (x == 125) {
            System.out.println("В точку!");
            System.out.println("Сколько будет 13*3?");
            int y = 0;
            y = sc.nextInt();
            if (y == 39) {
                System.out.println("Абсолютли!");
                System.out.println("Сколько будет 11*7?");
                int z = 0;
                z = sc.nextInt();
                if (z == 77) {
                    System.out.println("Ты знал или угадал?");
                } else {
                    System.out.println("Сегодня не день Бэкхема");
                }
            } else {
                System.out.println("Ты сегодня не в форме, сынок!");
            }
            } else {
            System.out.println("Упс! Попробуй еще раз!");
        }
    }
}
