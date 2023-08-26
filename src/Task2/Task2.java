//Задача 2 средняя:
//
//Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
package Task2;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String string = "Hello";
        char[] arrayCharacter = string.toCharArray();
        for (int i = 0; i < arrayCharacter.length - 1; i++) {
            for (int j = i + 1; j < arrayCharacter.length; j++) {
                if (arrayCharacter[i] == arrayCharacter[j]) {
                    System.out.println("В строке: " + string + " повторяющийся сивол: " + arrayCharacter[i]);
                }
            }
        }
    }
}

