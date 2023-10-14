public class EmployeeSal implements Comparable<EmployeeSal> {
    private int age;

    EmployeeSal(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        EmployeeSal es = (EmployeeSal) obj;
        return this.getAge() == es.getAge() ? true : false;
    }
    @Override 
    public int hashCode(){
        int a =0;
        return a++;
    }

    @Override
    public String toString() {
        return "Age : " + age;
    }

    @Override
    public int compareTo(EmployeeSal e) {
        return this.age < e.age ? -1 : 1;
    }
}
