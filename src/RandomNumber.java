//Сгенерируйте 3 случайных числа. Выведите самое большое из них.

public class RandomNumber {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        System.out.println(a + ", " + b + ", " + c);

        double max1 = Math.max(a, b);
        double max = Math.max(max1, c);

        System.out.println(max);
    }
}
