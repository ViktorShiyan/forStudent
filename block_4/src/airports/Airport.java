package airports;

public class Airport { // Аэропорт
    private int num;
    private Runway[] runway;

    public Airport(int num, Runway[] runway) {
        super();
        this.num = num;
        this.runway = runway;
    }

    public void findFree(int i) {

        if (runway[i].isFree()) {
            System.out.println("Полоса № " + i + " свободна");
        } else {
            System.out.println("Полоса № " + i + " занята");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Runway[] getRunway() {
        return runway;
    }

    public void setRunway(Runway[] runway) {
        this.runway = runway;
    }

}