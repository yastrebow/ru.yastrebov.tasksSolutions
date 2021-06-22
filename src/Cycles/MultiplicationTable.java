package Cycles;

//Распечатайте в программе таблицу умножения чисел от 1 до 10.

public class MultiplicationTable {
    public static void main(String[] args) {
    int x = 1;
    int y = 1;

    for(x = 1; x < 10; x++){
        for(y = 1; y < 10; y++){
            int res = x*y;
            System.out.print(res + " ");
        }
        System.out.println();
    }
    }
}
