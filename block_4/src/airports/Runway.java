package airports;

public class Runway { // Взлетная полоса
    private boolean isBusy;
    private boolean isFree;


    public Runway(boolean isFree, boolean isBusy) {

        this.isBusy = isBusy;
        this.isFree = isFree;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public void set(boolean isFree, boolean isBusy) {

        this.isBusy = isBusy;
        this.isFree = isFree;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }
}