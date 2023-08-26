//Задача 1 - легкая:
//
//Сформировать и заполнить массив случайным числами и вывести максимальное,
//минимальное и среднее значение.
//Для генерации случайного числа использовать метод Math.random(), который возвращает
//значение в промежутке [0, 1].
package Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] array = new double[10];
        array = Arrays.stream(array).map(item -> Math.random()).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение: " + Arrays.stream(array).max().getAsDouble());
        System.out.println("Минимальное значение: " + Arrays.stream(array).min().getAsDouble());
        System.out.println("Среднее значение: " + (Arrays.stream(array).reduce((sum, b) -> sum + b).getAsDouble()) / array.length);
    }
}
