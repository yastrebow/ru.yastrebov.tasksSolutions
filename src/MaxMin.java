//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

import java.awt.event.InputEvent;

public class MaxMin {
    public static void main(String[] args) {
    double array[] = new double[100];
    for(int i=0; i < array.length; i++) {
        array[i] = Math.random();
    }
    double min = 1;
    double max = 0;
    double avg;
    double sum = 0;

    for (int i=0; i < array.length; i++) {
        if(array [i] < min) {
            min = array[i];
        }
        if(array[i] > max) {
            max = array[i];
        }
        sum = sum + array[i];
    }
        avg = sum/array.length;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + avg);
    }
}
