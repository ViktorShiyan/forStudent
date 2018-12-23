package adventure;

public class Route {
    private static int count = 0;
    private int id;
    private String name;
    private String country;
    private String discription;
    private int price;

    public Route(String name, String country, String discription, int price) {
        this.name = name;
        this.country = country;
        this.discription = discription;
        this.price = price;
        this.id = count;
        count++;
    }

    public String toString() {
        return name + " " + price + " рублей";
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDiscription() {
        return this.discription;
    }

    public int getPrice() {
        return this.price;
    }
}
