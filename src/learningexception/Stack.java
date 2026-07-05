package learningexception;

public class Stack {

    private int size;
    private int top;
    private int[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int value) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException("Stack is full");
        }
        top++;
        stack[top] = value;
    }

    public int pop() throws StackUnderFlowException {
        int value =-1;
        if (top == -1) {
            throw new StackUnderFlowException("Stack is empty");
        }
        value = stack[top];
        top--;
        return value;
    }
}
