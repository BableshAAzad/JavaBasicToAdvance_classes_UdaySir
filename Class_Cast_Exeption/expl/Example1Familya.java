package expl;

class Fathera {
    int x = 10;
}

class Sona extends Fathera {
    int y = 20;
}

class Doughtera extends Fathera {
    int z = 30;
}

public class Example1Familya {
    public static void main(String[] args) {
        Fathera f = new Fathera();
        Sona s = new Sona();
        Doughtera d = new Doughtera();

        System.out.println(s instanceof Fathera);
        System.out.println(s instanceof Sona);

        System.out.println(d instanceof Fathera);
        System.out.println(d instanceof Doughtera);

        System.out.println(f instanceof Fathera);
        System.out.println(f instanceof Sona);
        System.out.println(f instanceof Doughtera);

        System.out.println(new Sona() instanceof Fathera);
        System.out.println(new Fathera() instanceof Doughtera);
    }
}
