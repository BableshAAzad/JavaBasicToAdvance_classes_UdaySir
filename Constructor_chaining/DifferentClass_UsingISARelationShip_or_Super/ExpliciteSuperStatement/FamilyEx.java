package Constructor_chaining.DifferentClass_UsingISARelationShip_or_Super.ExpliciteSuperStatement;

class Father {
    Father(int age) {
        System.out.println(1);
    }
}

class Son extends Father {
    Son() {
        super(22);
        System.out.println(2);
    }
}

class FamilyEx {
    public static void main(String[] args) {
        Son s = new Son();
    }
}
