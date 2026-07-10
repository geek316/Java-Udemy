package learningjavalangpackage;

import java.util.HashMap;

public class LearningStringStringBufferStringBuilder {
    static void main() {

        String str1 = "Hello";
        StringBuffer strBuff = new StringBuffer("Hello");
        StringBuilder strBuilder = new StringBuilder("Hello");

        str1.concat(" World!");
        strBuff.append(" World!");
        strBuilder.append(" World!");

        System.out.println(str1);
        System.out.println(strBuff);
        System.out.println(strBuilder);

    }
}
