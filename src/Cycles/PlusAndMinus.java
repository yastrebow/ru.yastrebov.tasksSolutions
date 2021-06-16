package Cycles;

//Посчитаем выражение 1-2+3-4+5-6.

public class PlusAndMinus {

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 6; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
            else {
                sum -= i;
            }
        }
        System.out.println(sum);
    }
}
