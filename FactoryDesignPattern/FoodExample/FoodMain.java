import java.util.Scanner;

class Food {

}

class Idly extends Food {

}

class Dosa extends Food {

}

class Poori extends Food {

}

class Hotel {
    /**
     * Documentation comment
     * the return type is food because the method can different types of objects.
     * If the return type was Idly, method return only object of Idly.
     * likewise for all the other objects. therefore using Generalization if the
     * return type is Food, we can return Idly object, Dosa Object, Poori Object.
     */
    Food orederFood(int choise) {
        if (choise == 1) {
            Idly i = new Idly();
            return i;
        } else if (choise == 2) {
            Dosa d = new Dosa();
            return d;
        } else if (choise == 3) {
            Poori p = new Poori();
            return p;
        } else
            return null;
    }
}

public class FoodMain {
    public static void main(String[] args) {
        // if choise is 1 -> Food obj = new Idly();
        // if choise is 2 -> Food obj = new Dosa();
        // if choise is 3 -> Food obj = new Poori();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of food : ");
        int n = sc.nextInt();
        Hotel hotel = new Hotel();
        Food obj = hotel.orederFood(n);
        if (obj instanceof Idly)
            System.out.println("Eating Idly");
        else if (obj instanceof Dosa)
            System.out.println("Eating Dosa");
        else if (obj instanceof Poori)
            System.out.println("Eating Poori");
        else
            System.out.println("Invalid choise");
    }
}
