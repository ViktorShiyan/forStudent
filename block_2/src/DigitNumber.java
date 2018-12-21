import java.util.Scanner;

/**
 * Определить количество разрядов введенного с клавиатуры числа.
 */
public class DigitNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String number = in.nextLine();
        System.out.println("Колличество разрядов в числе = " + number.length());
    }
}
