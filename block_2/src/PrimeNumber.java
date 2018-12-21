import java.util.Scanner;

/**
 * . Программа запрашивает ввод числа с клавиатуры. Определить, является ли
 * введенное число простым.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Введите число!");
        Scanner in = new Scanner(System.in);
        int number = Integer.valueOf(in.nextLine());
        if (PrimeNumber.isPrime(number)) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }

    /**
     * Метод определяет является ли число простым
     *
     * @param n число для проверки
     * @return истину если число простое
     */
    private static boolean isPrime(int n) {
        boolean result = true;
        if (n < 2) result = false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) result = false;
        return result;
    }
}
