import java.util.Comparator;

public class EmployeeeSortByName implements Comparator<Employeee> {
    @Override
    public int compare(Employeee x, Employeee y) {
        return x.name.compareTo(y.name);
    }
}
