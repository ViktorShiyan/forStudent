import java.util.Random;
import java.util.Scanner;

/**
 * В поле размером 10 на 10 клеток случайным образом появляются 7 танков.
 * Игрок делает ставку и задает с клавиатуры номера 10 клеток. Если игрок
 * угадал расположение всех танков, его очки увеличиваются в двое, не менее
 * четырех танков – увеличиваем очки в полтора раза; в остальных случаях
 * отнимаем ставку. Игрок обладает некоторой начальной суммой. Игра
 * проходит в бесконечном цикле, выход из цикла осуществляется по желанию
 * Игрока (после очередной победы или поражения), либо, когда игрок потеряет
 * все очки.
 */
public class Tanks {
    public static void main(String[] args) {
        int score = 100;
        int rate = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            if (score <= 0) {
                System.out.println("GAME OVER \n У ВАС НЕТ ОЧКОВ");
                break;
            }
            System.out.println(" У тебя " + score + " очков.\n Желаешь сделать ставку? " +
                    "\n Введите y если хотите\nВведите n если не хотите");
            if (in.nextLine().equals("n")) {
                System.out.println("Досвидания");
                break;
            }
            boolean rateWhile = true;
            while (rateWhile) {
                System.out.println("Сделайте ставку. Введите сумму ");
                rate = Integer.valueOf(in.nextLine());
                if (rate > score) {
                    System.out.println("Ставка слишком большая. У вас всего " + score + " очков");
                } else if (rate < 0) {
                    System.out.println("Ставка не может быть отрицательной или равной нулю");
                } else {
                    rateWhile = false;
                }
            }
            boolean[][] tanks = new boolean[10][10];

            String[][] pole = {
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "},
                    {" X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "}
            };
            Random random = new Random();
            int end = 0;
            while (true) {
                int x = random.nextInt(9);
                int y = random.nextInt(9);
                if (!tanks[x][y]) {
                    tanks[x][y] = true;
                    pole[x][y] = " T ";
                    end++;
                }
                if (end == 7) {
                    break;
                }
            }
            System.out.println("| |0|1|2|3|4|5|6|7|8|9\n" +
                    "|0|X|X|X|X|X|X|X|X|X|X\n" +
                    "|1|X|X|X|X|X|X|X|X|X|X\n" +
                    "|2|X|X|X|X|X|X|X|X|X|X\n" +
                    "|3|X|X|X|X|X|X|X|X|X|X\n" +
                    "|4|X|X|X|X|X|X|X|X|X|X\n" +
                    "|5|X|X|X|X|X|X|X|X|X|X\n" +
                    "|6|X|X|X|X|X|X|X|X|X|X\n" +
                    "|7|X|X|X|X|X|X|X|X|X|X\n" +
                    "|8|X|X|X|X|X|X|X|X|X|X\n" +
                    "|9|X|X|X|X|X|X|X|X|X|X\n"
            );
            int count = 0;
            int xCell;
            int yCell;
            Cell[] arrCell = new Cell[10];
            while (true) {
                System.out.println("Введите координату Х ставки " + (count + 1));
                xCell = Integer.valueOf(in.nextLine());

                System.out.println("Введите координату Y ставки " + (count + 1));
                yCell = Integer.valueOf(in.nextLine());

                arrCell[count] = new Cell(xCell, yCell);
                count++;
                if (count == 10) break;
            }
            int countWin = 0;
            for (int i = 0; i < 10; i++) {
                if (tanks[arrCell[i].x][arrCell[i].y]) {
                    countWin++;
                }
            }
            if (countWin == 10) {
                score = score + (rate * 2);
                System.out.println("Вы везунчик.Нашли все танки.Теперь ваши очки ровны " + score);
            } else if (countWin >= 4) {
                score = score + (rate + rate / 2);
                System.out.println("Вы везунчик.Нашли " + countWin + " танков Теперь ваши очки ровны " + score);
            } else {
                score -= rate;
                System.out.println("Печаль.Вы нашли всего " + countWin + " танков Теперь ваши очки ровны " + score);
            }
            System.out.println("Танки были тут.");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(pole[i][j]);
                }
                System.out.println();
            }

        }
    }
}

class Cell {
    int x;
    int y;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}