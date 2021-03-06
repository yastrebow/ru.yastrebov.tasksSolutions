package Cycles;

// помощью цикла рассчитайте значение выражений:

//
//
//з) 100 - 99 -98 -97 - 96 -... - 3 -2 -1 //не всё здесь нужно пихать в цикл и можно использоват

import static java.lang.Math.sqrt;

public class ArithmeticTasksTwo {

    public static void main(String[] args) {
//       a) 10+20+30+40 (ответ равен 100)
        int sum = 0;
        for(int i = 10; i <= 40; i+= 10) {
            sum = sum + i;
        }
        System.out.println(sum);

        //    б) 10+20+30+40+...+100 (ответ равен 550)
        int sum1 = 0;
        for(int i = 10; i <= 100; i+= 10) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

        //   в) 30+40+...+100 (ответ равен 520)
        int sum2 = 0;
        for(int i = 30; i <= 100; i+= 10) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        //   г) 3+6+9+12+15+18 (ответ равен 63)
        int sum3 = 0;
        for(int i = 3; i <= 18; i+= 3) {
            sum3 = sum3 + i;
        }
        System.out.println(sum3);

        //   д) 2 + 4 + 8 + 16 + 32 + 64 + 128 //каждый раз умножаем слагаемое на 2
        int sum4 = 0;
        for(int i = 2; i <= 128; i *= 2) {
            sum4 = sum4 + i;
        }
        System.out.println(sum4);

        //   е) 4 + 9 + 16 + 25 + 36 + 49 + 64 (ответ равен 89439.0) //каждый раз возводим слагаемое в квадрат
        int sum5 = 0;
        for(int i = 2; i <= 8; i++) {
            int j = i * i;
            sum5 = sum5 + j;
        }
        System.out.println(sum5);

        //   ж) 10 -20 +30 - 40 +50 - 60 + 70 //то плюс, то минус
        int sum6 = 0;
        for(int i = 10; i <= 70; i += 10) {
           if(i % 20 == 0){
            sum6 = sum6 - i;}
           else {
               sum6 = sum6 + i;}
        }
        System.out.println(sum6);

        //  з) 100 - 99 -98 -97 - 96 -... - 3 -2 -1 //не всё здесь нужно пихать в цикл и можно использоват
        int sum7 = 100;
        for(int i = 100; i > 0; i--) {
           sum7 = sum7 - i;
        }
        System.out.println(sum7);

//        Вычислить последовательно числа и все вывести на экран:
//a1 = 10
//a2 = 10 + a1
//a3 = 10 + a2
//....
//a100 = 10 + a99
        int a = 0;
        int i = 1;
        while (i <= 100) {
            a = a + 10;
            System.out.println("Это a" + i + " и она равна " + a);
            i++;
        }

//        Вычислите последовательно числа (даны ниже) и выведите их на экран, и также посчитайте их сумму.
//        То есть конкретно посчитайте a1+a2+a3+...+a10
//
//Уточните, что результат укладывается в максимальное значение выбранного вами типа данных и что дробная часть нигде не отброшена.
//
//Имейте в виду, что a1, a2, a3 нужно не только вычислить по отдельности,
// но ещё и сложить их всех между собой в какой-то отдельной переменной, чтобы посчитать сумму.
// Значение результата может не поместиться в double - оцените, начиная с какого номера a становится Infinity.
// Infinity обозначает бесконечность и это уже не обычное число, это значит, что программа работает не нормально.
// Старайтесь исправлять ситуации в боевых ситуациях, чтобы не приходилось иметь дело с такими огромными числами,
// а пока просто познакомимся с ними.
//a1 = 5
//a2 = sqrt ( 10+ a1*a1*a1/1000000 ) + 2* a1*a1
//a3 = sqrt ( 10+ a2*a2*a2/1000000 ) + 2* a2*a2
//...
//a10 = sqrt ( 10+ a99*a99*a99/1000000 ) + 2* a99*a99

        double b = 5;
        int j = 1;
        double summa = 0;
        double inf = Double.POSITIVE_INFINITY;
        while (j <= 10) {
            b = sqrt (10 + b*b*b/1000000) + 2 * b * b;
            System.out.println("Это b" + j + " и она равна " + b);
            summa = summa + b;
            j++;
        }
        System.out.println(summa);
    }
}
