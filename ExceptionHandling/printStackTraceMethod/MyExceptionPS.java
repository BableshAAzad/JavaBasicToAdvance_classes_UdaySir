public class MyExceptionPS extends Exception {
    String msg;
    MyExceptionPS(String msg){
        this.msg = msg;
    }
    @Override
    public String toString(){
        return msg;
    }
}
