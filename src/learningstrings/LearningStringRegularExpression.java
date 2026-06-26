package learningstrings;

public class LearningStringRegularExpression {
    public static void main(String[] args) {

        String str = "a2b";
        System.out.println(str.matches("[a-z][0-9][a-z]"));

        String str2 = "t";
        System.out.println(str2.matches("."));
        System.out.println(str2.matches("t|f"));

        String str3 = "abc";
        System.out.println(str3.matches("abc"));

        String str4 = "7";
        System.out.println(str4.matches("\\d"));

        String str5 = "a";
        System.out.println(str5.matches("\\D"));

        String str6 = "a";
        System.out.println(str6.matches("\\w"));

        String str7 = "@";
        System.out.println(str7.matches("\\W"));

        String str8 = " ";
        System.out.println(str8.matches("\\s"));

        String str9 = " ";
        System.out.println(str9.matches("\\S"));

        // Any Number
        String str10 = "abc";
        System.out.println(str10.matches("[abc]*"));
        System.out.println(str10.matches("[abc]+"));
        System.out.println(str10.matches("[abc]{2}"));
        System.out.println(str10.matches("[abc]{2,}"));
        System.out.println(str10.matches("[abc]{2,3}"));

        String str11 = "rat";
        System.out.println(str11.matches("[tar]{3}"));

        String email = "email@dell.com";
        System.out.println(email.matches(".*dell.*"));
        System.out.println(email.matches("(\\w*)@dell(.*)"));

    }
}
