package sortingObjects;

public class StudentSort implements Comparable<StudentSort> {
    int age;
    String name;
    Double height; // Wrapper class declation to call campareTo() later

    StudentSort(int age, String name, Double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Age : " + age + ", Name : " + name + ", Height : " + height;
    }

    @Override
    public int compareTo(StudentSort ss) {
        return this.age - ss.age;
    }
    /**
     * this -> current object to be inserted
     * s -> already existing object
     * 
     * Sortin based on age (int) :
     * 1. Ascending order -> return this.age - ss.age;
     * 2. Descending order -> return ss.age - this.age;
     * 
     * Sorting based on name (String) :
     * 1. Ascending order -> return this.name.compareTo(ss.name);
     * 2. Descending order -> return ss.name.compareTo(this.name);
     * 
     * Sorting based on height (Double) :
     * 1. Ascending order -> return this.hieght.compareTo(ss.height);
     * 2. Descending order -> return ss.height.compareTo(this.height);
     * 
     */
}
