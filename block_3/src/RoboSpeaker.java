public class RoboSpeaker {
    public static void main(String[] args) {
        String[] lines = {
                "Sparkyssstarout",
                "Outhiyousparky",
                "starseesparkyyou",
                "sstarseeoutuyytgf",
                "seehiyousparky"
        };
        //регулярное вырожение описывающее условие диалога
        String Pattern = "(?:(?:sparky|hi|star)()|(?:you|see|out)())++\\1\\2";

        for (String line : lines) {
            //если строка подходит под регулярное вырожение
            if (line.matches(Pattern))
                System.out.println(line);
        }
    }
}
