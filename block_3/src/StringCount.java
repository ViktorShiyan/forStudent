import java.util.Scanner;

/**
 * Написать программу, определяющую количество слов в строке, введенной с
 * клавиатуры (слова в строке разделены пробелом).
 */
public class StringCount {
    public static void main(String[] args) {
        System.out.println("Введите предложение");
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //создаём массив со всеми словами разделенными пробелами
        String[] arrWord = data.split(" ");
        //arrWord.length показывает сколько слов в массиве
        System.out.println("Колличество введенных слов = " + arrWord.length);
    }
}
