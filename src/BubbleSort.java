//Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class BubbleSort {
    public static void main(String[] args) {
        double array[] = new double[100]; //создаем массив на 100 элементов
        for (int i = 0; i < array.length; i++) { //заполняем его случайными числами
            array[i] = Math.random();
        } //пузырьковая сортировка
        for (int i = 0; i < array.length; i++) { //для i-того элемента от 0 до 99
            for (int j = 0; j < array.length - i - 1; j++) { //для j-того элемента от 0 до i-того элемента
                if (array[j] > array[j + 1]) { //сравниваем два элемента, и если 1-й больше 2-го
                    double tmp = array[j]; //сохраняем 1-й (бОльший) во временную переменную
                    array[j] = array[j + 1]; //присваиваем меньший элемент элементу с меньшим индексом
                    array[j + 1] = tmp; //элементу с большим индексом присваиваем бОльший элемент из временной переменной
                }
            }
        }
        for (int i = 0; i < array.length; i++) { //печатаем отсортированный массив
            System.out.println(array[i]);
        }
    }
}
//if(true) {
//
//        break;
//
//        System.out.println("Hello world");
//
//        }
