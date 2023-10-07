package PracticeQuestionInterface;

interface Aa1{
    void method1(); // compiler will be confused and given to run time error 
//  and given error unsolved problem or method duplication 
}
interface Ba1{
    String method1();
}

// public class MainInterfaceEx implements Aa1, Ba1 {

//     @Override
//     public String method1() {
//        return null;
//     }
    
// }
