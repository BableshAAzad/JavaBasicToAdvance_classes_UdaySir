import java.util.Comparator;

public class EmployeeListComparator implements Comparator<EmployeeList> {
	@Override
	public int compare(EmployeeList x, EmployeeList y) {
//		return x.getId() - y.getId();
		return x.getId() < y.getId() ? -1 : 1;
	}
}
