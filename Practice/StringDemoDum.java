public class StringDemoDum {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bab");
        StringBuilder sb1 = new StringBuilder("lesh");
        sb.append(sb1);
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());

    }
    /*
     * 
     * Bablesh
     * lesh
     * 19
     * 20
     */
}
