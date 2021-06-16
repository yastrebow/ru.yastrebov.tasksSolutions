package Cycles;

//Посчитаем произведение 4*8*12*16*20. То есть нужно все эти числа перемножить между собой.
public class ProductOfNumbers {

    public static void main(String[] args) {
        int mult = 1;
        for(int i = 4; i <= 20; i++) {
            if(i % 4 == 0) {
                mult *= i;
            }
        }
        System.out.println(mult);
    }
}
