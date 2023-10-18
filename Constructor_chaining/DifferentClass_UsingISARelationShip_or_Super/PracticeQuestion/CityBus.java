public class CityBus {
    int id;
    String name;
    double price;

    public CityBus() {

    }

    public CityBus(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name : " + name;
    }

    public static void main(String[] args) {
        CityBus sb = new CityBus(100, "Bablesh", 22.22);
        System.out.println(sb);
        // -------------------------------------------------------
        CityBus sb1 = new CityBus() {
            @Override
            public String toString() {
                return "Id : " + sb.id;
            }
        };
        System.out.println(sb1);
    }
}
