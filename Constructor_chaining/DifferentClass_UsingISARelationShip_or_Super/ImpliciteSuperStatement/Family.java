package Constructor_chaining.DifferentClass_UsingISARelationShip_or_Super.ImpliciteSuperStatement;

class Father {
    Father() {
        System.out.println(1);
    }
}

class Son extends Father {
    Son() {
        System.out.println(2);
    }
}

class Family {
    public static void main(String[] args) {
        Son s = new Son();
    }
}
