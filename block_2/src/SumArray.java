import java.util.Random;

/**
 * Создать массив из 5 произвольных чисел, вывести на экран сумму цифр
 * каждого элемента.
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        //Заполнили массив случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(999999);
        }
        for (int item : arr) {
            System.out.println("Сумма цифр в числе " + item + " ровна - " + SumArray.sum(item));
        }

    }


    /**
     * Метод для суммирования цифр в числе
     *
     * @param number число для суммирования
     * @return сумму цифр
     */
    public static int sum(int number) {
        int sum = 0;
        String numbers = Integer.toString(number);
        for (int j = 0; j < numbers.length(); j++) {
            sum += Character.getNumericValue(numbers.charAt(j));
        }
        return sum;
    }
}
