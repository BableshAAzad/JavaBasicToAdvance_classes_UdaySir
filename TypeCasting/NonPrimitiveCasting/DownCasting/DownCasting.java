package TypeCasting.NonPrimitiveCasting.DownCasting;

class Fatherf {
    String name = "John";
}

class Sons extends Fatherf {
    int age = 22;
}

public class DownCasting {
    public static void main(String[] args) {
        Fatherf ff = new Sons(); // up casting
        System.out.println(ff.name);

        Sons s = (Sons) ff; // down casting
        System.out.println(s.name + " " + s.age);
    }
}
