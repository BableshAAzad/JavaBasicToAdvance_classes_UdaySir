package expl;

class Fatherb {
    int x = 10;
}

class Sonb extends Fatherb {
    int y = 20;
}

class Doughterb extends Fatherb {
    int z = 30;
}

public class Example2Familyb {
    static void displayb(Fatherb obj) {
        if (obj instanceof Sonb) {
            System.out.println("Down Casting to son");
            Sonb s = (Sonb) obj;
            System.out.println(s.x + " " + s.y);
        } else if (obj instanceof Doughterb) {
            System.out.println("Down casting to doughter");
            Doughterb d = (Doughterb) obj;
            System.out.println(d.x + " " + d.z);
        }
    }

    public static void main(String[] args) {
        displayb(new Sonb());
        System.out.println("____________________");
        displayb(new Doughterb());
    }
}
