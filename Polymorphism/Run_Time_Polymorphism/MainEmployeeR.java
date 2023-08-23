class EmployeeR {
    void work() {
        System.out.println("Working");
    }
}

class DeveloperR extends EmployeeR { // Rule-I
    @Override
    void work() { // Rule-II
        System.out.println("Developing App");
    }
}

class TesterR extends EmployeeR { // Rule-I
    @Override
    void work() { // Rule-II
        System.out.println("Testing");
    }

}

public class MainEmployeeR {
    static void displayR(EmployeeR obj) {
        obj.work();
    }

    public static void main(String[] args) {
        EmployeeR e1 = new DeveloperR(); // Rule-III
        e1.work();
        EmployeeR e2 = new TesterR(); // Rule-III
        e2.work();

        System.out.println("------------------------");

        EmployeeR emp;
        emp = new DeveloperR(); // Rule-III
        emp.work();
        emp = new TesterR(); // Rule-III
        emp.work();

        System.out.println("-------------------------");

        displayR(new DeveloperR());
        displayR(new TesterR());
    }
}
