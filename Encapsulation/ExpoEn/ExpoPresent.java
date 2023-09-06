class ExpoP {
    private int age;
    private String name;

    public void setAge(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return this.age + " " + this.name;
    }
}

public class ExpoPresent {
    public static void main(String[] args) {
        ExpoP ep = new ExpoP();
        ep.setAge(20, "Bablesh");
        String detail = ep.getAge();
        System.out.println(detail);
    }
}
