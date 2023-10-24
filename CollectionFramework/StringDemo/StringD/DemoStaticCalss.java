public strictfp class DemoStaticCalss {
    double a = 20.31;

     strictfp double m1() {
        return a;
    }
    final{
        
    }

    public static void main(String[] args) {
        DemoStaticCalss d = new DemoStaticCalss();
        System.out.println(d.m1());
    }
}
