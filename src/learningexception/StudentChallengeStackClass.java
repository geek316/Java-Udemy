package learningexception;


public class StudentChallengeStackClass {
    static void main() {

        Stack stack = new Stack(2);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);

        } catch (StackOverFlowException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderFlowException e) {
            System.out.println(e.getMessage());
        }
    }
}
