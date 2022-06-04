import static java.lang.Math.sqrt;

public class JavaEasyTasks {
    public static void main(String[] args) {
//        System.out.println("Hello!");
//
//        int x = 7;
//        int y = 11;
//        int z = 0;
//
//        System.out.println(x + y + z);
//        System.out.println(x - y);
//        System.out.println(y * z);
//        System.out.println((double) x / y);
//        //System.out.println(y / z);
//
//        System.out.println(x * x + y * y);
//        System.out.println(x * x * x);
//
//        System.out.println(Integer.MAX_VALUE);
//          int n = 2147483647+1;
//          System.out.println(n);// вывод: отрицательное число, поскольку больше возможного для int

//        double b = 2-1.2;
//        double c = b;
//        System.out.println(b);
//
//        int a = 0;
//        int b = 1;
//        int c = 2;
//        int d = 3;
//        int e = 4;
//        int f = 5;
//        int g = 6;
//        int h = 7;
//        int i = 8;
//        int j = 9;
//        int k = (a+b+c+d+e+f+g+h+i+j)/10;
//        System.out.println(k);
//
//        double a1 = 0;
//        double b1 = 1;
//        double c1 = 2;
//        double d1 = 3;
//        double e1 = 4;
//        double f1 = 5;
//        double g1 = 6;
//        double h1 = 7;
//        double i1 = 8;
//        double j1 = 9;
//        double k1 = (a1+b1+c1+d1+e1+f1+g1+h1+i1+j1)/10;
//        System.out.println(k1);

//        Объявите 2 переменных типа double со значениями
//x = 0.25, y = 0.9;
//Посчитайте выражения, каждый раз выводя их на экране:
//10*x + y
//y * sqrt (x)
//возведите x в степень y и затем вычтите 1

//        double x = 0.25;
//        double y = 0.9;
//        System.out.println(10*x + y);
//        System.out.println(y * sqrt(x));
//        System.out.println(Math.pow(x, y) - 1);

  //      Пусть x = -10; сколько будет Math.sqrt (x) ? Выведите на печать это значение.

//        int x = - 10;
//        System.out.println(Math.sqrt(x));//NaN

//        Пусть x = 5, y = 10; Выведите на экран sqrt (x*x + y*y); Это и есть гипотенуза треугольника со сторонами x, y.
//        int x = 5;
//        int y = 10;
//        System.out.println(Math.sqrt(x*x + y*y));


//        Проведите вычисления
//z = sqrt (y-x);
//z = z +1;
//            int x = 10;
//            int y = 20;
//            double z = Math.sqrt(y-x);
//            System.out.println(z);
//
//            z = z + 1;
//            System.out.println(z);

//        int x = 30;
//        int y = 40;
//        int z = Math.abs(y-x);
//        System.out.println(z);
//
//        z = z * z;
//        System.out.println(z);

//        Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
//        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
//        Выведите на экран переменную, которая = стоимости суммы A+B со скидкой.
//        Отдельно выведите на экран сумму скидки от этой покупки.

//        int a = 1000;
//        int b = 500;
//        double disc = (a+b)*0.1;
//        double sumVoutDisc = (a+b)*0.9;
//        System.out.println("Сумма покупки со скидкой: " + sumVoutDisc);
//        System.out.println("Сумма скидки: " + disc);

//        Исправьте ошибки в коде:
//        а) int x = 20 //должно быть - объявление переменной икс = 20
//        int x = x + 50; //должно быть - увеличить икс на 50
//        б) u = 100; //должно быть - объявление переменной u = 100
//        int m = u * 2; // //должно быть - объявление переменной m в два раза больше u
//        в) int k = (1 / 5) * 1000; //исправьте, чтобы результат не обнулялся.

        int x = 20;
        x = x + 50;
        int u = 100;
        int m = u * 2;
        double k = ((double) 1/ 5) * 1000;
        System.out.println(x + ", " + u + ", " + m + ", " + k);

//        Сделайте расчет товаров со скидками. Лучше решить с переменными, чем без.
//        а) товар А стоит 200 руб и на него скидка 15%, а товар Б стоит 30 руб. Клиент взял 10 A и 2 Б. Выведите итоговую цену:
//        б) товар А стоит 500 руб и на него скидка 50%, а товар Б стоит 50 руб. Клиент взял 7 A и 1 Б. Выведите итоговую цену:
//        в) товар А стоит 300 руб и на него скидка 10%, а товар Б стоит 20 руб. Клиент взял 2 A и 3 Б. Выведите итоговую цену.

        int prod1 = 200;
        double disc1 = 0.15;
        int prod2 = 30;
        double sum1 = prod1*10*(1 - disc1) + prod2*2;
        System.out.println(sum1);

        int prod3 = 500;
        double disc2 = 0.5;
        int prod4 = 50;
        double sum2 = prod3*7*(1 - disc2) + prod4;
        System.out.println(sum2);

        int prod5 = 300;
        double disc3 = 0.1;
        int prod6 = 20;
        double sum3 = prod5*2*(1 - disc3) + prod6*3;
        System.out.println(sum3);

    }
}
