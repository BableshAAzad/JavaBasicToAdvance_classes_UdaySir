class Myntra {
    void purchase(String brand) {
        System.out.println("Brand : " + brand);
    }

    void purchase(int cost) {
        System.out.println("Cost : " + cost);
    }

    void purchase(String brand, int cost) {
        System.out.println("Brand : " + brand + " Cost : " + cost);
    }

    void purchase(int cost, String brand) {
        System.out.println("Cost : " + cost + " Brand : " + brand);
    }
}

public class MainMyntra {
    public static void main(String[] args) {
        Myntra m = new Myntra();
        m.purchase("Laptop", 30000);
        m.purchase("Moblie");
        m.purchase(25000);
        m.purchase(2000, "Whatch");
    }
}
