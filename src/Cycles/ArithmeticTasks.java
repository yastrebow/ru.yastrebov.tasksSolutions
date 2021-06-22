package Cycles;

//С помощью цикла вычислите:

public class ArithmeticTasks {
    public static void main(String[] args) {

//        a) 1+2+3+4
        int sum = 0;
         for(int i = 1; i < 5; i++) {
             sum = sum + i;
         }
        System.out.println(sum);

//         б) 1+2+3+4+5+6+...+100
        int sum1 = 0;
         for(int i = 1; i < 101; i++) {
             sum1 = sum1 + i;
         }
             System.out.println(sum1);

//         в) 2+4+6+8
        int sum2 = 0;
        for(int i = 2; i <= 8; i += 2) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        //         г) 2+4+6+8 + ... + 100
        int sum3 = 0;
        for(int i = 2; i <= 100; i += 2) {
            sum3 = sum3 + i;
        }
        System.out.println(sum3);

        //         д) 3+4+5+6+7+8+9+...+100
        int sum4 = 0;
        for(int i = 3; i <= 100; i ++) {
            sum4 = sum4 + i;
        }
        System.out.println(sum4);

        //         е) (2+4+8+16+32+64+128)*100
        int sum5 = 0;
        int res;
        for(int i = 2; i <= 128; i *= 2) {
            sum5 = sum5 + i;
        }
            res = sum5 * 100;
            System.out.println(res);
        }

}
