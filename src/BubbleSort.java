//Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class BubbleSort {
    public static void main(String[] args) {
        double array[] = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

