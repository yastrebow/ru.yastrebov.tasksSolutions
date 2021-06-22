package Cycles;

//Распечатать символ a, так что в первой строке всего один символ, во второй - два, в третьей - три, и так далее до 5.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintSymbolA {
    public static void main(String[] args) {
        for(int k = 0; k < 3; k++) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print('a');
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            System.out.println('a');
        }

//        Выведите на экран последовательность строк (можно посимвольно, но и можно как строки):
//a
//aa
//aaa
//aaaa
//aaaaa
//....
//aaaaaaaaaaaaaaaaaaaa  //20 символов a

            for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print('a');
                }
                System.out.println();
            }
    }
}
