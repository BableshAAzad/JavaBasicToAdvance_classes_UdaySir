package TypeCasting.PrimitiveCasting.Widening;

// byte-->short-->char-->int-->long-->long-->float-->double

public class WideningExample {
    public static void main(String[] args) {
        int a = 23;
        double b = a;
        System.out.println(a + " " + b);

        double c = 44;
        System.out.println(c);

        char i = 'A';
        int j = i;
        System.out.println(i + " " + j);
    }
}
