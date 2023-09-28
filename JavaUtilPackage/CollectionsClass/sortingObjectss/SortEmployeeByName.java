package sortingObjectss;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<EmployeeSort> {
    @Override
    public int compare(EmployeeSort x, EmployeeSort y) {
        return x.name.compareTo(y.name); // for descending y.name.compareTo(x.name);
    }
    /**
     * x -> Current object to be inserted
     * y -> Already existing object
     * 
     * for String comparison, we can not use '-', use compareTo() of String class
     */
}
