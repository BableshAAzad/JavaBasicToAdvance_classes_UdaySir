public class ForEachDemo {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, };
        System.out.println("--------Integer--------");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("--------Double--------");
        double[] d = { 10.8, 39.3, 45.2, 107.3 };
        for (double dd : d) {
            System.out.print(dd + " ");
        }
        System.out.println("\n");
        System.out.println("--------String--------");
        String[] str = { "Banana", "Orange", "Mango" };
        for (String fruit : str) {
            System.out.print(fruit + " ");
        }
    }
}
