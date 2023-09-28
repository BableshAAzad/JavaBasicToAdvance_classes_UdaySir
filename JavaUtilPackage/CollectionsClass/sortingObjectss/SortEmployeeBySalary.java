package sortingObjectss;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<EmployeeSort> {
    @Override
    public int compare(EmployeeSort x, EmployeeSort y) {
        return x.salary.compareTo(y.salary); // for descending y.salary.compareTo(x.salary);
    }
    /**
     * x -> Current object to be inserted
     * y -> Already existing object
     * 
     * for Double comparison, we can not use '-', use compareTo() of Double class
     */
}
