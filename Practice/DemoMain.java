
class Studenta{
    void study(){
        System.out.println("Student is Studing...");
    }
}

class Electronic extends Studenta{
    @Override
    void study(){
        System.out.println("Overriden method ...");
    }
}

public class DemoMain {
    public static void main(String[] args) {
        Studenta sa;
        sa = new Electronic();
        sa.study();
    }
}
