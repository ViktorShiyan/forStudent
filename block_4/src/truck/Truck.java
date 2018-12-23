package truck;

public class Truck {
    private double currentWeight;
    private double maximumWeight;

    public Truck() {
        this.currentWeight = 0;
        this.maximumWeight = 100;
    }

    public Truck(double currentWeight, double maximumWeight) {
        this.currentWeight = currentWeight;
        this.maximumWeight = maximumWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setMaximumWeight(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void IncWeight(double amount) {
        try {
            if (currentWeight + amount > maximumWeight) {
                throw new Exception("Максимальный вес превышен.");
            } else {
                this.currentWeight += amount;
                System.out.println("Текущий вес = " + currentWeight);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
