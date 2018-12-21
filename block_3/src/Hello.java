import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как твоё имя?");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}