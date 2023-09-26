package EmployeeComparator;
import java.util.Comparator;
import java.util.TreeSet;

class FoodCom {
    int menu;

    FoodCom(int menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Menu : " + menu;
    }
}

class FoodComparator implements Comparator<FoodCom> {
    @Override
    public int compare(FoodCom x, FoodCom y) {
        return x.menu - y.menu;
    }
}

public class FoodMainComparator {
    public static void main(String[] args) {
        FoodCom fc1 = new FoodCom(40);
        FoodCom fc2 = new FoodCom(10);
        FoodCom fc3 = new FoodCom(20);
        FoodCom fc4 = new FoodCom(50);
        FoodComparator x = new FoodComparator();
        TreeSet<FoodCom> t = new TreeSet<FoodCom>(x);
        t.add(fc1);
        t.add(fc2);
        t.add(fc3);
        t.add(fc4);
        for (FoodCom f : t)
            System.out.println(f);
    }
}
