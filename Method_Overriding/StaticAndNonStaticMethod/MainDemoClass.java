class Demo1{
    static void m1(int a){
        System.out.println(a);
    }
    int x = 10;
    static int y = 20;
    static{
        int sum = 0;
        Demo1 d1 = new Demo1();
        sum = d1.x+y;
        System.out.println("Sum is : "+sum);
    }
}
class Demo2 extends Demo1{
static void m2(){
    }
}

public class MainDemoClass extends Demo2{
    public static void main(String[] args) {
        // Demo2 d2 = new Demo2();
        // Demo2.m1();
        m1(10);
    }
}
