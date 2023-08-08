package Method_Overriding.Hierarical_Inharitance;

class Employee {
    void work() {
        System.out.println("working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developing app");
    }
}

class Tester extends Employee{
    @Override
    void work(){
        System.out.println("Testing app");
    }
}

class TeamTest{
    public static void main(String[] args) {
        Tester ts = new Tester();
        ts.work();
    }
}