package Scanner;//Введите с клавиатуры строчку.
//а) Если в ней есть буква 'a', то напечатайте "в этом тексте была буква a".
//б) Если в строке содержится слово "арбуз", то напечатайте "в этом тексте было слово арбуз".
//Введите ещё одну строчку с клавиатуры.
//в) Если последние и начальные буквы двух этих двух строчек совпадают, то напечатайте, что программа это обнаружила.
//г) Выведите на экран сначала одну из введенных строк, потом другую в порядке, в котором эти строки шли бы в словаре. Поможет одна из функций класса String.
//д) Выведите ту строчку, в которой больше символов.
//е) Выведите первую строчку без начального символа.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ScanStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String controlWord = "арбуз";

        System.out.println("Введите какую-нибудь фразу");
        String string1 = scanner.nextLine();

        for (int i = 0; i < string1.length(); i++)
        if(string1.charAt(i) == 'а'){
            System.out.println("В этом тексте есть буква а");
        }

        if(string1.contains(controlWord)){
            System.out.println("В этом тексте есть слово арбуз");
        }
//Введите ещё одну строчку с клавиатуры.
//в) Если последние и начальные буквы двух этих двух строчек совпадают, то напечатайте, что программа это обнаружила.
//г) Выведите на экран сначала одну из введенных строк, потом другую в порядке, в котором эти строки шли бы в словаре.
// Поможет одна из функций класса String.
//д) Выведите ту строчку, в которой больше символов.
//е) Выведите первую строчку без начального символа.
        System.out.println("Введите какую-нибудь фразу");
        String string2 = scanner.nextLine();

        if(string1.charAt(0) == string2.charAt(0) & string1.charAt(string1.length() - 1) == string2.charAt(string2.length() - 1)) {
            System.out.println("Первые и последние символы введенных строк совпадают");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(string1);
        arrayList.add(string2);
        Collections.sort(arrayList);

        System.out.println(arrayList);

        if(string1.length() == string2.length()) {
            System.out.println("Длины строк равны");
        }
        else if(string1.length() > string2.length()) {
            System.out.println(string1);
        }
        else {
            System.out.println(string2);
        }
        System.out.println(string1.substring(1));
        }

}
