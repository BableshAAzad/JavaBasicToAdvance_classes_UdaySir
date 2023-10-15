
interface Food {
    void eat();
}

public class FoodM implements Food {
    @Override
    public void eat() {
        System.out.println("Eating food");
    }

    public static void main(String[] args) {
        Food f = new FoodM();
        f.eat();
    }
}
