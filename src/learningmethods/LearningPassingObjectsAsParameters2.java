package learningmethods;

public class LearningPassingObjectsAsParameters2 {
    public static void main(String[] args) {

        String name = "Hemant";
        System.out.println(updateName(name));
        System.out.println(name);
    }

    static String updateName(String name) {
        name = name.concat(" Sharan");
        return name;
    }
}
