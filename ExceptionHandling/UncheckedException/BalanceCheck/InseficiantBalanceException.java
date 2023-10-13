package BalanceCheck;

public class InseficiantBalanceException extends RuntimeException {
    private String message;
    InseficiantBalanceException(String message){
        this.message = message;
    }
    @Override
    public String toString(){
        return "Message : "+message;
    }
}
