package money;

public class Money {

    private String valuta;
    private double sum;

    public Money(String valuta, double sum) {
        this.valuta = valuta;
        this.sum = sum;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


}
