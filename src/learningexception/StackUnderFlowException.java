package learningexception;

public class StackUnderFlowException extends Exception {
    public StackUnderFlowException(String message) {
        super(message);
    }

    public String toString() {
        return "StackUnderFlowException: " + getMessage();
    }
}
