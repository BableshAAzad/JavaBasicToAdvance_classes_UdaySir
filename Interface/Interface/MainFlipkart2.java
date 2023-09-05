package Interface;

interface Flipkart {
    void buy();
}

interface Phonepe extends Flipkart {
    void pay();
}

class Jack implements Phonepe {
    @Override
    public void buy() {
        System.out.println("Buying Laptop");
    }

    @Override
    public void pay() {
        System.out.println("Paying Rs. 40000");
    }
}

public class MainFlipkart2 {
    public static void main(String[] args) {
        Jack j = new Jack();
        j.buy();
        j.pay();
    }
}
