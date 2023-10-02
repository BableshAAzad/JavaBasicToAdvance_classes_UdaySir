public class DemoMultipeCatchBlocks {
    public static void main(String[] args) {
        int[] a = {10, 20,30};
        System.out.println("Start");
        try{
            System.out.println(a[5]);
            System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index OutOfBond Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("End");
    }
}
