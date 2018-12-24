package users;

/**
 * Класс описывающий пользователя
 */
public class User {
    private static int globalId = 0;
    private String login;
    private String password;
    private int id;

    public User(String login, String password) {
        this.login = login;
        this.password = this.ciphrIt(password);
        this.id = globalId++;
    }

    /**
     * Переопределенный метод
     *
     * @return значения пользователя в строке
     */
    public String toString() {
        return "Пользователь № " + this.id + " : " + this.login + "»";
    }

    /**
     * Получить логин
     *
     * @return логин
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Получить ID
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Простое шифрование пароля
     *
     * @param password входной пароль
     * @return зашифрованный пароль
     */
    private String ciphrIt(String password) {
        int key = 5;
        String result = "";
        char[] arrPass = password.toCharArray();
        for (char arrPass1 : arrPass) {
            result += String.valueOf(arrPass1 + 5);
        }
        return result;
    }
}
