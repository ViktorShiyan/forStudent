package adventure;

public class Client {
    private String[] loveCounty;
    private String[] notLoveCounty;
    private int money;
    private String name;

    public Client(String name, String[] loveCounty, String[] notLoveCounty, int money) {
        this.loveCounty = loveCounty;
        this.notLoveCounty = notLoveCounty;
        this.money = money;
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public String[] getLoveCounty() {
        return this.loveCounty;
    }

    public String[] getNotLoveCounty() {
        return this.notLoveCounty;
    }
}
