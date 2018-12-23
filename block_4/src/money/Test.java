package money;

public class Test {
    static int dolarToRub = 60;
    static int euroToRub = 63;

    public static void main(String[] args) {
        Money m1 = new Money("euro", 200);
        Money m2 = new Money("dollar", 200);

        System.out.println(sum(m1, m2).getSum() + " рублей");
    }

    public static Money sum(Money m1, Money m2) {
        double m1ToRub = m1.getSum();
        double m2ToRub = m2.getSum();
        if (m1.getValuta().equals(m2.getValuta())) {
            return new Money(m1.getValuta(), m1.getSum() + m2.getSum());
        } else {
            if (m1.getValuta().equals("dollar")) {
                m1ToRub = (m1.getSum() * dolarToRub);
            } else if (m1.getValuta().equals("euro")) {
                m1ToRub = (m1.getSum() * euroToRub);
            }


            if (m2.getValuta().equals("dollar")) {
                m2ToRub = (m2.getSum() * dolarToRub);
            } else if (m2.getValuta().equals("euro")) {
                m2ToRub = (m2.getSum() * dolarToRub);
            }

            return new Money("rub", m1ToRub + m2ToRub);

        }
    }
}
