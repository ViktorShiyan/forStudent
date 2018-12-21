import java.util.regex.*;

/**
 * Найти количество вхождений подстроки “test” в строке
 * “astratestestdumbcreeptestonehappytest”.
 */
class Occurrence {
    public static void main(String[] args) {
        String str = "astratestestdumbcreeptestonehappytest";
        String substr = "test";
        Pattern p = Pattern.compile(substr);
        Matcher m = p.matcher(str);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        System.out.println("Колличество вхождений слова test = " + counter);
    }
}