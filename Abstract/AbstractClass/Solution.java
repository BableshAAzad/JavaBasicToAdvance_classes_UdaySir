package Abstract.AbstractClass;

abstract class Person{
    abstract void eat();
}

class Tom extends Person{
    @Override
    void eat(){
        System.out.println("Tom is eating");
    }
}

public class Solution {
    public static void main(String[] args) {
        Tom t = new Tom();
        t.eat();
    }
}
