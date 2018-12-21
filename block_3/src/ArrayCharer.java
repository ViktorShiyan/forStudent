import java.util.Arrays;

/**
 * Превратить строку “myflamethrowersnakehisses” в массив символов,
 * отсортировать массив по убыванию, вывести отсортированный массив на
 * экран.
 */
public class ArrayCharer {
    public static void main(String[] args) {
        String str = "myflamethrowersnakehisses";
        char[] arrChar = str.toCharArray();
        Arrays.sort(arrChar);
        for (char ch : arrChar) {
            System.out.println(ch);
        }
    }
}
