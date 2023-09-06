
public class HashcodeMain {
    @Override
    public int hashCode() {
        return 123;
    }

    public static void main(String[] args) {
        HashcodeMain hm = new HashcodeMain();
        System.out.println(hm);
        System.out.println(hm.hashCode());
    }
}
