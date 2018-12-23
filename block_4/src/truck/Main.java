package truck;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        for (int i = 0; i < 10; i++) {
            truck.IncWeight(11);
        }
        Truck truck2 = new Truck(10, 200);
        for (int i = 0; i < 10; i++) {
            truck2.IncWeight(11);
        }
    }
}
