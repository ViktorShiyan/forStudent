/**
 * Два робота ведут диалог (слова одного робота чередуются со словами
 * другого). Первый может произносить слова: sparky, hi, star. Второй – you, see,
 * out. Даны 5 строк:
 * Sparkyssstarout
 * Outhiyousparky
 * starseesparkyyou
 * sstarseeoutuyytgf
 * seehiyousparky
 * Определить, какие из них являются диалогами.
 */
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
