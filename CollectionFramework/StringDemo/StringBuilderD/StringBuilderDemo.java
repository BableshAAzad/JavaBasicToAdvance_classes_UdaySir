public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bablesh");
        StringBuilder sb2 = new StringBuilder(" Kumar");
        StringBuilder sb3 = new StringBuilder(" AAzad");
        sb1.append(sb2);
        System.out.println(sb1);
        sb2.append(" Bablesh");
        System.out.println(sb2);
        sb1.append(sb3);
        System.out.println(sb1);
        System.out.println(sb3);
    }
}
