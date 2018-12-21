import java.util.Arrays;

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
