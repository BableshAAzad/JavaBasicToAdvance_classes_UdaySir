package Method_Overriding.Single_Level_Inheritance;

class FatherSon {
    public static void main(String[] args) {
        Son s = new Son();
        s.bike();
    }
}

class Father {
    void bike() {
        System.out.println("Old Fashioned Father bike");
    }
}

class Son extends Father {
    @Override
    void bike() {
        System.out.println("New modified sons bike");
    }
}
