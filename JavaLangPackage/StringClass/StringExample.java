public class StringExample {
    public static void main(String[] args) {
		String a = "Bablesh";
		String b = "Bablesh";
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println("------------------------");
		String aaString = new String("Bablesh");
		String bbString = new String("Bablesh");
		System.out.println(aaString.equals(bbString));
		System.out.println(aaString == bbString);
        System.out.println("-------------------------");
        String ab = "Bablesh";
		String ba = "BabLesh";
        System.out.println(ab.equalsIgnoreCase(ba));
        System.out.println(ab.substring(4));
	}
}
