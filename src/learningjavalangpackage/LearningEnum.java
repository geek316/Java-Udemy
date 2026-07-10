package learningjavalangpackage;

enum Dept {
    COMPUTER_SCIENCE("John", "Block-A"),
    INFORMATION_AND_TECHNOLOGY("Jane", "Block-B"),
    MECHANICAL_ENGINEERING("Mark", "Block-C"),
    ELECTRONICS_AND_COMMUNICATION("Lily", "Block-D"),
    CIVIL_ENGINEERING("John", "Block-E");

    private String head;
    private String block;

    private Dept(String head, String block) {
        this.head = head;
        this.block = block;
    }

    public String getHead() {
        return this.head;
    }

    public String getBlock() {
        return this.block;
    }

    public void Display() {
        System.out.println(this.name() + " : " + this.ordinal());
    }
}

public class LearningEnum {
    static void main() {

        Dept[] dept = Dept.values();
        for (Dept d : dept) {
            System.out.println(d);
        }

        Dept d = Dept.CIVIL_ENGINEERING;
        d.Display();
        System.out.println(d.getHead() + " : " + d.getBlock());
    }
}
