class FetherD {
    int a = 10;
}

class SenD extends FetherD {
    int b = 20;
}

class DoughtD extends FetherD {
    int c = 30;
}

public class ExmpleDown {
    protected void display(FetherD obj) {
        if (obj instanceof SenD) {
            System.out.println("SenD downcasted");
            SenD sd = (SenD) obj;
            System.out.println(sd.a + " " + sd.b);
        } else if (obj instanceof DoughtD) {
            System.out.println("DoughtD upcasted");
            DoughtD dd = (DoughtD) obj;
            System.out.println(dd.a + " " + dd.c);
        }
    }

    public static void main(String[] args) {
        ExmpleDown ed = new ExmpleDown();
        ed.display(new SenD());
        System.out.println("-----------------");
        ed.display(new DoughtD());
    }
}
