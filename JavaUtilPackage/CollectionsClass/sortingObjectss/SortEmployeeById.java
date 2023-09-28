package sortingObjectss;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<EmployeeSort> {
    @Override
    public int compare(EmployeeSort x, EmployeeSort y) {
        return x.id - y.id;  // for Descending -> return y.id - x.id;
    }
    /**
     * x -> Current object to be inserted
     * y -> Already existing object
     */
}
