package Task4;//Задача 4 посложнее:
//        Напишите метод, который будет вычислять угол между часовой и минутной стрелками
//        часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
//        Расчет угла производить относительно реального поведения стрелок часов.
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часы: ");
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите минуты: ");
        int minute = Integer.parseInt(scanner.nextLine());
        System.out.println("Угол между стрелками часов: " + ClockAngle(hours, minute) + "°");
    }
    static Double ClockAngle(int hoursClock, int minuteClock){
        if (hoursClock > 12) hoursClock -= 12;
        return Math.abs(hoursClock * 30 - 5.5 * minuteClock);
    }
}
