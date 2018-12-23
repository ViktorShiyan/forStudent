package adventure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TurCompany {
    private int position = 0;
    private Route[] routes = new Route[100];

    public static void main(String[] args) throws Exception {
        TurCompany turCompany = new TurCompany();
        turCompany.addRoute(new Route("Поездка в Италию", "Италия", "тур по Италии", 40000));
        turCompany.addRoute(new Route("Поездка в Россию", "Россия", "тур по России", 100000));
        turCompany.addRoute(new Route("Поездка в США", "США", "тур по США", 50000));
        turCompany.addRoute(new Route("Поездка в Германию", "Германия", "тур по Германии", 40000));
        turCompany.addRoute(new Route("Поездка в северную Италию", "Италия", "тур по северной Италии", 40000));
        Client clientItal = new Client("Coco", new String[]{"Россия", "США"}, new String[]{"Германия", "Италия"}, 200000);
        Client clientItal2 = new Client("Soso", new String[]{"Россия", "США"}, new String[]{"Германия", "Италия"}, 60000);
        Client clientUsa = new Client("Jhon", new String[]{"США"}, new String[]{"Германия", "Италия", "Россия"}, 600000);
        Client clientJuda = new Client("Jacov", new String[]{"Россия", "США", "Италия"}, new String[]{"Германия"}, 60000);
        turCompany.recomendationRoute(clientItal);
        turCompany.recomendationRoute(clientItal2);
        turCompany.recomendationRoute(clientUsa);
        turCompany.recomendationRoute(clientJuda);

    }

    /**
     * Метод для добавленяи маршрута
     *
     * @param route маршрут
     * @return true если успешно
     * @throws Exception если маршрут с таким названием уже есть
     */
    public boolean addRoute(Route route) throws Exception {
        boolean resultat = true;
        for (Route item : routes) {
            if (item != null && item.getName().equals(route.getName())) {
                resultat = false;
                throw new Exception("Маршрут с таким названием уже есть");
            }
        }
        this.routes[position] = route;
        position++;
        return resultat;
    }

    /**
     * Метод подбора маршрута
     *
     * @param client клиент
     * @return массив с подобранными маршрутами
     */
    public void recomendationRoute(Client client) {
        HashSet<Route> routeList = new HashSet<Route>();
        //Проверка подходит ли маршрут
        for (Route item : this.routes) {
            for (String country : client.getNotLoveCounty()) {
                for (String loveCountry : client.getLoveCounty()) {
                    if (item != null && item.getPrice() < client.getMoney() && !item.getCountry().equals(country) && item.getCountry().equals(loveCountry)) {
                        routeList.add(item);
                    }
                }
            }
        }
        if (routeList.isEmpty()) {
            System.out.println("Нет подходящих маршрутов для " + client.toString() + "\n");
        } else {
            System.out.println(client.toString() + " вам подойдут следующии маршруты");
            for (Route rout : routeList) {
                System.out.println(rout.toString());
            }
            System.out.println("\n");
        }
    }
}
