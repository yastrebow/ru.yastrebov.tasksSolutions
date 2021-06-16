package Scanner;//Считайте с клавиатуры строчку. Выведите её же, но все вхождения малой буквы 'a', замените на заглавную 'A'.
// Вам поможет функция replace класса String - узнайте как она действует самостоятельно.

import java.util.Scanner;

public class ToUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any phrase");
        String str = scanner.nextLine();

        System.out.println(str.replace("k", "K"));
    }
}
