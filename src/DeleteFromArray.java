import java.util.Arrays;

public class DeleteFromArray {

 //   Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).

    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};

        //Array.toString
        //выводим в консоль массив test_array без двоек
        System.out.println(Arrays.toString(removeElement(test_array, 2)));
    }
//создаем метод удаления элемента с аргументами(массив, удаляемыйЭлемент)
    private static int[] removeElement(int[] nums, int val) {
       int j = 0; //переменная, задающая величину, на которую нужно переместить влево элемент массива

        for(int i = 0; i < nums.length; i++) { //цикл для обхода элементов массива
            if(nums[i] == val){ //если элемент массива равен удаляемомуЭлементу
                j++; //увеличиваем переменную - в нашем случае +1, +1
            }
            else {
                nums[i - j] = nums[i]; //иначе: nums[4 - 2] = nums[4], т.е. элементу массива 2 присваивается значение элемента 4
            }
        }
        //возвращаем копию массива с длиной на j меньшей исходной
        return Arrays.copyOf(nums, nums.length - j);
    }
}
