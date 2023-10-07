import java.util.Comparator;

public class EmployeeeSortBySalary implements Comparator<Employeee> {
    @Override
    public int compare(Employeee x, Employeee y) {
        return x.salary.compareTo(y.salary);
    }
}
