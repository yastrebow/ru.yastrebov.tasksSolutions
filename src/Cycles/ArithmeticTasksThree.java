package Cycles;

//Рассчитайте, используя циклы:

public class ArithmeticTasksThree {

    public static void main(String[] args) {
        //а) 5 + 10+ 15+ 20+ … +1000 (будет 100500)

        int sum = 0;
        for (int i = 5; i <= 1000; i += 5) {
            sum = sum + i;
        }
        System.out.println(sum);

//        б) 5*7+10*14+15*21+20*28+…+1000*1400 (будет 94034500)

        int sum1 = 0;
        int num1 = 5;
        int num2 = 7;
        for (int j = 1; j <= 200; j++) {
            sum1 = sum1 + num1 * j * num2 * j;
        }
        System.out.println(sum1);

        //в) 5*7-10*14+15*21-20*28+…+1000*1400 (будет -703500)

        int sum2 = 0;
        for (int j = 1; j <= 200; j++) {
            if (j % 2 == 1) {
                sum2 = sum2 + num1 * j * num2 * j;
            } else {
                sum2 = sum2 - num1 * j * num2 * j;
            }
        }
        System.out.println(sum2);

        //г) 1*2*3*4*5*…*10 (будет 3628800)

        int multipl = 1;
        for(int i = 1; i <= 10; i++) {
            multipl = multipl*i;
        }
        System.out.println(multipl);

        //д) 5 + 10+ 15+ 20+ … +1000 - 1*2*3*4*5*…*10 (будет -3528300)

        int sum3 = 0;
        for (int i = 5; i <= 1000; i += 5) {
            sum3 = sum3 + i;
        }
        int multipl1 = 1;
        for(int i = 1; i <= 10; i++) {
            multipl1 = multipl1*i;
        }
        System.out.println(sum3 - multipl1);

//е) 5500 – 5400 – 5300 – 5200 – 5100 – 5000 – 4900 - … - 100 (будет -154000)
        int diff = 0;
        for (int i = 5500; i >= 100; i -= 100) {
            diff = diff - i;
        }
            System.out.println(diff);


        //ж) 3 + 3*3 + 3*3*3 + 3^4 + …. + 3^10 (будет 88572)
        // 3^10 читается как 3 в степени 10

        int sum4 = 0;
        int num3 = 3;
        for (int i = 1; i <= 10; i++) {
            int degree = (int) Math.pow(num3, i);
            sum4 = sum4 + degree;
        }
        System.out.println(sum4);

        //з) 3 - 3*3 + 3*3*3 - 3^4 + …. - 3^10 (будет -44286)

        int sum5 = 0;
        int num4 = 3;
        for (int i = 1; i <= 10; i++) {
            int degree = (int) Math.pow(num3, i);
                if(i % 2 == 0){
                    sum5 = sum5 - degree;}
                else {
                    sum5 = sum5 + degree;}
            }
            System.out.println(sum5);
    }
}
