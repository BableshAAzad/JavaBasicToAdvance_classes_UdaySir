public class NormalBlock {
    {
        System.out.println("Above block");
    }

    public static void main(String[] args) {
        NormalBlock nb1 = new NormalBlock();
        System.out.println("Main Method loaded");
        NormalBlock nb2 = new NormalBlock();
    }

    {
        System.out.println("Down block");
    }
    /*
     * Above block
     * Down block
     * Main Method loaded
     * Above block
     * Down block
     */
}
