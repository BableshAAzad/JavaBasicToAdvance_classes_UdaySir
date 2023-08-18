package Interface;

interface Developer{
    void developer();
}
interface Tester{
    void tester();
}
class Employeex{
    void work(){
        System.out.println("Employee is working");
    }
}
class John extends Employeex implements Developer, Tester{
    @Override 
    public void developer(){
        System.out.println("Developing the app");
    }
    @Override
    public void tester(){
        System.out.println("Testing app");
    }
}

public class MainDeveloper3 {
    public static void main(String[] args) {
        John j = new John();
        j.work();
        j.developer();
        j.tester();
    }
}
