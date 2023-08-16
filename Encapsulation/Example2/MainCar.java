package Encapsulation.Example2;

public class MainCar {
    public static void main(String[] args) {
        Cars cs = new Cars();
        cs.setCost(200);
        System.out.println("Cost : " + cs.getCost());
        int cost = cs.getCost();
        System.out.println("Cost : " + cost);
    }
}
