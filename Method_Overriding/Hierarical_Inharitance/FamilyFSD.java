package Method_Overriding.Hierarical_Inharitance;

class Father {
    void bike() {
        System.out.println("Father Bike");
    }
}

class Son extends Father {
    @Override
    void bike() {
        super.bike();
        System.out.println("Son Aquare father bike");
    }
}

class Douter extends Father {
    @Override
    void bike() {
        super.bike();
        System.out.println("Douter quare Father bike");
    }
}

public class FamilyFSD {
    public static void main(String[] args) {
        Son s = new Son();
        s.bike();
        System.out.println("----------------------------");
        Douter d = new Douter();
        d.bike();
    }
}
