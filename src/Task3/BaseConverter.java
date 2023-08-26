//Задача 3 посложнее:
//
//        Напишите класс BaseConverter для конвертации из градусов поЦельсиюв
//        Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
//        и делает конвертацию.
//        При запуске кода должна быть возможность ввести градусы Цельсия и выбора
//        конвертации в Кельвины или Фаренгейты
package Task3;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        Double temperature = Double.parseDouble(scanner.nextLine());
        System.out.print("Для перевода температуры в шкалы Келвин, Фаренгет, Реомюра введите цифру 1 , 2 или 3 соответственно: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index == 1) System.out.println(convert(ScaleTemperature
                .KELVIN, temperature) + ScaleTemperature.KELVIN.getDegreeScale());
        if (index == 2) System.out.println(convert(ScaleTemperature
                .FAHRENHEIT, temperature) + ScaleTemperature.FAHRENHEIT.getDegreeScale());
        if (index == 3) System.out.println(convert(ScaleTemperature
                .REAUMUR, temperature) + ScaleTemperature.REAUMUR.getDegreeScale());
        if (index > 3 || index < 1) System.out.println("Неверный выбор");
    }

    public static double convert(ScaleTemperature scaleTemperature, double temperature) {
        double result = 0;
        switch (scaleTemperature) {
            case REAUMUR:
                result = (4.0 / 5) * temperature;
                break;
            case FAHRENHEIT:
                result = ((9.0 / 5) * temperature + 32);
                break;
            case KELVIN:
                result = (temperature + 273.15);
                break;
        }
        return result;
    }
}
