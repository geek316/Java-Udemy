package learningmethods;

public class StudentChallengeMethodOverloadingValidateNameAndAge {
    public static void main(String[] args) {

        String name = "Summi";
        int age = 25;

        System.out.println("Is the name valid: " + validate(name));
        System.out.println("Is the age valid: " + validate(age));

    }

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age) {
        return age >= 18 && age <= 60;
    }


}
