import java.util.Comparator;

public class EmployeeeSortById implements Comparator<Employeee> {
    @Override
    public int compare(Employeee x, Employeee y) {
        return x.id - y.id;
    }
}
