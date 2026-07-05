package learningexception;

public class StackOverFlowException extends Exception{

    public StackOverFlowException(String message){
        super(message);
    }

    public String toString(){
        return "StackOverFlowException: " + getMessage();
    }
}
