package TypeCasting.PrimitiveCasting.Narrowing;

// double-->float-->long-->int-->char-->short-->byte

public class NarrowingExmple {
    public static void main(String[] args) {
        double a = 13.45;
        int b = (int) a;
        System.out.println(a + " " + b);

        int x = (int) 25.7;
        System.out.println(x);

        int y = 98;
        char z = (char) y;
        System.out.println(y + " " + z);
    }
}
