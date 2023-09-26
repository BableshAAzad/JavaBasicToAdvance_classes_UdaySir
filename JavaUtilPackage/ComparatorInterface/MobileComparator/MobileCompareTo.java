package MobileComparator;
public class MobileCompareTo implements Comparable<MobileCompareTo> {
    int cost;
    String brand;

    MobileCompareTo(int cost, String brand) {
        this.cost = cost;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand : "+this.brand+"Cost : " + this.cost;
    }

    @Override
    public int compareTo(MobileCompareTo c) {
        return this.cost - c.cost;
    }
}
