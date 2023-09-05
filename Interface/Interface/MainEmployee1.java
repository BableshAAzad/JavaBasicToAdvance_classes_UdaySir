package Interface;

interface EmployeeI {
    int id = 101; // public static final int id = 101 fixed
    void work(); // public abstract void work();
}

class Tom implements EmployeeI {
    @Override
    public void work() {
        System.out.println("Tom is working");
    }
}

public class MainEmployee1 {
    public static void main(String[] args) {
        System.out.println("ID : " + EmployeeI.id);
        Tom t = new Tom();
        t.work();
        // System.out.println("ID : " + t.id);   This is also possible 
    }
}
