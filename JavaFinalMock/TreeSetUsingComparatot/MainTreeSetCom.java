import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MainTreeSetCom {
    int price;
    String fname;

    MainTreeSetCom(int price, String fname) {
        this.price = price;
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Price : " + price + ", Food Name : " + fname;
    }

    public static void main(String[] args) {
        MainTreeSetCom sno1 = new MainTreeSetCom(34, "Poori");
        MainTreeSetCom sno2 = new MainTreeSetCom(50, "Dosa");
        MainTreeSetCom sno3 = new MainTreeSetCom(20, "Italy");
        MainTreeSetCom sno4 = new MainTreeSetCom(15, "Samosa");
        MainTreeSetCom sno5 = new MainTreeSetCom(25, "Kachodi");
        Comparator<MainTreeSetCom> c = (x, y) -> x.price - y.price;
        // Use Comprator Lambda function for sorting
        TreeSet<MainTreeSetCom> ts = new TreeSet<MainTreeSetCom>(c);
        ts.add(sno1);
        ts.add(sno2);
        ts.add(sno3);
        ts.add(sno4);
        ts.add(sno5);
        Iterator<MainTreeSetCom> i = ts.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
