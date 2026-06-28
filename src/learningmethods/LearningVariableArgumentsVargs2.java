package learningmethods;

public class LearningVariableArgumentsVargs2 {
    public static void main(String[] args) {

        String[] names = {"Summit", "John", "Jane", "Doe"};
        int start = 5;
        showNameList(start, names);

    }

    static void showNameList (int start, String...x){
        System.out.println("List of names:");
        for(int i=0; i<x.length; i++){
            System.out.println(start++ + ". " + x[i]);
        }
    }

}
