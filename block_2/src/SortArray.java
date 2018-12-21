import java.util.Random;

/**
 * Создать двумерный массив 15 на 15. Заполнить его числами. Реализовать
 * алгоритм сортировки по возрастанию, отсортировать каждую строку массива.
 * Вывести результат сортировки на экран
 */
public class SortArray {
    public static void main(String[] args) {
        int[][] arr = new int[15][15];
        Random random = new Random();
        //В этом цикле заполняем массив случайными числами
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        //В этом цикле сортируем
        for (int in = 0; in < 15; in++) {
            arr[in] = SortArray.sort(arr[in]);
        }
        //В этом цикле выводим результат
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    /**
     * Метод реализующий сортировку пузырьком
     *
     * @param arr входной массив для сортировки
     * @return отсортированный массив
     */
    public static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

}
