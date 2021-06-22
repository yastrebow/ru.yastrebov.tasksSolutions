package Cycles;

//Выведите на экран номера полей из морского боя:
//а1 б1 в1 г1 д1 е1 ж1 з1 и1 к1
//а2 б2 в2 г2 д2 е2 ж2 з2 и2 к2
//а3 б3 в3 г3 д3 е3 ж3 з3 и3 к3
//…
//а10 б10 в10 г10 д10 е10 ж10 з10 и10 к10

public class SeaBattle {

    public static void main(String[] args) {
        Character[] symbols = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к'};
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < symbols.length; j++) {
                System.out.print(symbols[j].toString() + i + " ");
            }
            System.out.println();
        }
    }
}

