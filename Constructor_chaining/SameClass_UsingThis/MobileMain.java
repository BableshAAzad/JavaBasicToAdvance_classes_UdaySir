public class MobileMain {
    String brand;
    int modleNo;
    double price;

    MobileMain(String brand) {
        this.brand = brand;
    }

    MobileMain(String brand, int modleNo) {
        this(brand);
        this.modleNo = modleNo;
    }

    MobileMain(String brand, int modleNo, double price) {
        this(brand, modleNo);
        this.price = price;
    }

    public static void main(String[] args) {
        MobileMain mm1 = new MobileMain("Nokia", 1610, 2032.1);
        MobileMain mm2 = new MobileMain("Sony", 1012, 3004.8);
        System.out.println("Brand : " + mm1.brand + " Model number : " + mm1.modleNo + " Price : " + mm1.price);
        System.out.println("Brand : " + mm2.brand + " Model number : " + mm2.modleNo + " Price : " + mm2.price);
    }
}
