package learningmethods;

public class LearningPassingObjectsAsParameters {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        update(arr);
        System.out.println(arr[0]);
    }

    static void update(int[] arr) {
        arr[0] = 10;
    }

}
