
// import java.io.Serializable;

// public class EmployeeI implements Serializable {
// or
public class EmployeeI implements java.io.Serializable {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    EmployeeI() {
        System.out.println("EmployeeI Non-Parameterize constructor");
    }

    public static void main(String[] args) {
        EmployeeI ei = new EmployeeI();
        ei.setId(100);
        System.out.println("Your Id is : " + ei.getId());
    }
}
