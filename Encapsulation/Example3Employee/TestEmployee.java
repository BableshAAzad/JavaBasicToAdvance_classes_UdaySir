package Encapsulation.Example3Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("AAzad");
        String name = e.getName();
        System.out.println("Name : " + name);
        // ------------------------------
        e.setid(1001);
        int id = e.getId();
        System.out.println("Id : " + id);
    }
}
