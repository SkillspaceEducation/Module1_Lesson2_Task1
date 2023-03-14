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
        System.out.printf("Последняя цифра числа %d " + isLastDigit(digit),digit);
    }

    static String isLastDigit(int i) {
        final int DIGIT = 7;
        if ((i % 10) == DIGIT){
            return ("равна 7");
        }
        else {
            return ("не равна 7");
        }
    }
}