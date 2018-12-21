import java.util.Scanner;

/**
 * Программа запрашивает ввод с клавиатуры начального и конечного
 * значений диапазона целых чисел. Вычислить количество четных и нечетных
 * чисел в указанном диапазоне
 */
public class EvenNotEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало диапозона");
        int start = Integer.valueOf(in.nextLine());
        System.out.println("Введите конец диапозона");
        int finish = Integer.valueOf(in.nextLine());
        int even = 0;
        int notEven = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                notEven++;
            }
        }
        System.out.println("Четных чисел - " + even + "\nНечетных чисел - " + notEven);
    }
}
