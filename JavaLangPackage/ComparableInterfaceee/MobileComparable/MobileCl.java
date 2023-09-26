package MobileComparable;

public class MobileCl implements Comparable<MobileCl> {
    int price;
    String brand;

    MobileCl(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " Price : " + price;
    }

    @Override
    public int compareTo(MobileCl mc) {
        return this.price - mc.price;
    }
}
