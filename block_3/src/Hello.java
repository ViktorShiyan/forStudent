import java.util.Scanner;

/**
 * Программа запрашивает имя пользователя, затем выводит приветствие в
 * следующем виде: «Hello, имя»
 */
class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как твоё имя?");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}