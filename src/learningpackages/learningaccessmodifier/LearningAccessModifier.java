package learningpackages.learningaccessmodifier;

import learningpackages.mypack1.Demo1;

public class LearningAccessModifier {
    static void main() {
        Demo1 obj = new Demo1();
        obj.display();

        // Only public variable d is accessible
        System.out.println(obj.d);
    }
}
