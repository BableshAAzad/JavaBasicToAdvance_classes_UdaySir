public class StaticBlock {
    static {
        System.out.println("Static block above");
    }

    public static void main(String[] args) {
        System.out.println("Mai Method loaded");
    }

    static {
        System.out.println("Static block down");
    }
    /*
     * Static block above
     * Static block down
     * Mai Method loaded
     */
}
