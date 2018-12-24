package users;

/**
 * Класс обёртка над массивом пользователей
 */
public class UserList {

    public static void main(String[] args) throws Exception {
        UserList userList = new UserList();
        userList.addUser(new User("login", "gfgffg"));
        System.out.println(userList.getUsers(0).toString());
    }

    private User[] myList = new User[100];
    private int position = 0;

    /**
     * Метод для получения пользователя по ID
     *
     * @param id id
     * @return пользователя
     */
    public User getUsers(int id) {
        User user = null;
        if (this.findById(id)) {
            for (User findUser : this.myList) {
                if (findUser != null && findUser.getId() == id) {
                    user = findUser;
                }
            }
        }
        return user;
    }

    /**
     * Метод для добавления пользователя
     *
     * @param user пользователь
     * @throws Exception ошибка совпадения логина
     */
    public void addUser(User user) throws Exception {
        for (User item : myList) {
            if (item != null && item.getLogin().equals(user.getLogin())) {
                throw new UserException("Пользователь с таким логином уже есть");
            }
        }
        this.myList[position] = user;
        position++;
    }

    /**
     * Метод для удаления пользователя
     *
     * @param id id
     * @throws Exception ошибка удаления из пустого массива
     */
    public void delUser(int id) throws Exception {
        if (position == 0) {
            throw new UserException("Нет пользователей в массиве");
        }
        for (int i = 0; i < this.position; i++) {
            if (this.myList[i].getId() == id) {
                System.arraycopy(this.myList, i + 1, this.myList, i, position - 1);
                position -= 1;
                break;
            }
        }
    }

    /**
     * Метод проверяющий есть ли пользователь с Id
     *
     * @param id id
     * @return true если пользователь есть
     */
    public boolean findById(int id) {
        boolean result = false;
        for (User user : this.myList) {
            if (user != null && user.getId() == id) {
                result = true;
            }
        }
        return result;
    }
}
