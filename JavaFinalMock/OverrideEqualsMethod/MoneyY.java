public class MoneyY {
    int money;

    MoneyY(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
        MoneyY m = (MoneyY) obj;
        return this.money == m.money;
    }

    public static void main(String[] args) {
        MoneyY m1 = new MoneyY(100);
        MoneyY m2 = new MoneyY(100);
        System.out.println(m1.equals(m2)); // true
    }
}
