package Method_Over_Loading;

import java.util.Arrays;

public class OverLoadingMainMethod {
    public static void main(int x) {
        System.out.println("Integaer X : " + x);
    }

    public static void main(double x) {
        System.out.println("Double X : " + x);
    }

    public static void main(String[] x) {
        System.out.println("Start");
        main(101);
        main(49.9);
        int[] a = { 1, 2, 3, 4, 5, 6, };
        main(a);
        String[] b = { "Bablesh", "AAzad" };
        String[] c = { "Durgesh", "AAzad" };
        main(b, c);
        System.out.println("End");
    }

    public static void main(int[] args) {
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] a, String[] b) {
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
