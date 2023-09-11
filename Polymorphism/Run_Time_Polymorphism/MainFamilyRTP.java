class Father {
    int agef = 50;
    void age() {
        System.out.println("Father age : " + agef);
    }
    Father(){
        System.out.println("Father Constructor");
    }
}
class Son extends Father {
    int ages = 30;
    @Override
    void age() {
        System.out.println("Son age : " + ages);
    }
    Son(){
        System.out.println("Son Constructor");
    }
}
class Doughter extends Son {
    int aged = 25;
    @Override
    void age() {
        System.out.println("Doughter age : " + aged);
    }
    Doughter(){
        System.out.println("Doughter Constructor");
    }
}
class GrandSon extends Doughter {
    int ageGs = 30;
    @Override
    void age() {
        System.out.println("GrandSon age : " + ageGs);
    }
    GrandSon(){
        System.out.println("GrandSon Constructor");
    }
}
public class MainFamilyRTP {
    public static void main(String[] args) {
        Father f = new GrandSon();
        f.age();
    }
}
