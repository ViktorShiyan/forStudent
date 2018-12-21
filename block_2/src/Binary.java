import java.util.Scanner;

/**
 * Написать программу, переводящую число из 10й системы счисления в
 * двоичную.
 */
public class Binary {
    public static void main(String[] args) {
        int dec;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите десятичное число");
            dec = Integer.valueOf(in.nextLine());
            System.out.println("Введенное число в двоичном коде " + binar(dec));
        }
    }

    public static StringBuilder binar(int a) {
        StringBuilder result = new StringBuilder();
        int b;
        while (a != 0) {
            b = a % 2;
            result.append(b);
            a = a / 2;
        }
        return result.reverse();
    }


}
