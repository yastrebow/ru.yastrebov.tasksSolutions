package Cycles;

//Посчитаем сумму чисел 1, 2, …, 9.

public class Factorial {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        System.out.println("Посчитаем через for");
        for (i = 1; i < 10; i++) {
            sum = sum + i;

//            System.out.println(i + " " + sum);
        }
        System.out.println(sum);

        System.out.println("Посчитаем через while");
        while (i < 10) {
        sum += i;
        }
        System.out.println(sum);
    }
}
