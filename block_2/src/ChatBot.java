import java.util.Scanner;

/**
 * Написать консольный чат-бот. Вопросы, на которые должен
 * отвечать/задавать бот: Как тебя зовут? Где ты учишься/работаешь?
 * Нравится ли тебе место учебы/работы? Что ты делаешь в свободное время?
 */
public class ChatBot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] botQuest = {
                "Как тебя зовут?",
                "Где ты учишься/работаешь?",
                "Нравится ли тебе место учебы/работы?",
                "Что ты делаешь в свободное время?"
        };
        String[] botAnswer = {
                "Меня зовут БОТ",
                "Я работаю у тебя в компьютере",
                "Мне очень нравится",
                "У меня не свободного времени"
        };
        String word;
        while (true) {
            System.out.println("Введите вопрос боту");
            word = in.nextLine();
            String ans = "Я вас не понимаю";
            int qust = 0;
            for (int i = 0; i < 4; i++)
                if (word.equals(botQuest[i])) {
                    ans = botAnswer[i];
                    qust = i;
                    break;
                }

            System.out.println(ans);
            System.out.println(botQuest[qust] + "\nОтветьте боту.");
            word = in.nextLine();
        }
    }
}
