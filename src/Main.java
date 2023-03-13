import java.util.Scanner;
/*
Создайте    метод    с    одним    целочисленным    параметром.
Метод    должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        scanner.close();
        boolean result = isLastDigit(digit);
        if (result) System.out.printf("Последняя цифра числа %d равна 7", digit);
        else System.out.printf("Последняя цифра числа %d не равна 7", digit);
    }

    static boolean isLastDigit(int i) {
        final int DIGIT = 7;
        return (i % 10) == DIGIT;
    }
}