final public class MainClassFinal {
    public static void main(String[] args) {
        MainClassFinal2 m2 = new MainClassFinal2();
        m2.mainMethod1();
    }
}

class MainClassFinal2 extends MainClassFinal1 {
    MainClassFinal2() {
        super(10);
    }

    @Override
    void mainMethod1() {
        System.out.println("Main method 2");
    }
}

class MainClassFinal1 {
    MainClassFinal1(int age) {
        System.out.println("MainClass1 Contsructor");
    }

    void mainMethod1() {
        System.out.println("Main method 1");
    }
}
