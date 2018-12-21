public class NotSpace {
    public static void main(String[] args) {
        String[] arrData = {"spring", "tear a part", "wing", "slow wind", "creepy", "dark forest"};
        for (String str : arrData) {
            //Если в строке нет пробелов выводим в консоль
            if (!str.contains(" ")) {
                System.out.println(str);
            }
        }
    }
}
