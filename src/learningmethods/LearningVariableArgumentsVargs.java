package learningmethods;

public class LearningVariableArgumentsVargs {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};

        show();
        show(array);
        show(new int[] {4,9,1,0});
        show(9,8,8,6);

    }

    static void show (int...x){
        for(int a : x) {
            System.out.println(a);
        }
    }
}
