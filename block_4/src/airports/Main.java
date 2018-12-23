package airports;

public class Main {
    public static void main(String[] args) {

        Airport[] airoports = new Airport[3]; // 3-ри аэропорта

        Runway[] runway = new Runway[4]; // 4-ри посадочные полосы
        runway[0] = new Runway(false, true);
        runway[1] = new Runway(false, true);
        runway[2] = new Runway(true, true);
        runway[3] = new Runway(false, true);
        airoports[0] = new Airport(0, runway);

        Runway[] runway1 = new Runway[4]; // 4-ри посадочные полосы
        runway1[0] = new Runway(false, true);
        runway1[1] = new Runway(false, true);
        runway1[2] = new Runway(true, false);
        runway1[3] = new Runway(false, true);
        airoports[1] = new Airport(1, runway1);

        Runway[] runway2 = new Runway[4]; // 4-ри посадочные полосы
        runway2[0] = new Runway(false, false);
        runway2[1] = new Runway(false, false);
        runway2[2] = new Runway(false, true);
        runway2[3] = new Runway(true, true);
        airoports[2] = new Airport(2, runway2);


        for (Airport airport : airoports) {
            for (int i = 0; i < airport.getRunway().length; i++) {
                if (!airport.getRunway()[i].isBusy()) {
                    System.out.println("Аэропорт № " + airport.getNum());
                    airport.findFree(i);

                }
            }
        }


    }
}
