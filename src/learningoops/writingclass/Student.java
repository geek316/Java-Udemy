package learningoops.writingclass;

public class Student {

    public int rollNumber;
    public String name;
    public String course;
    public int mark1, mark2, mark3;

    public int total(int... marks) {
        int totalMarks = 0;
        for (int mark : marks)
            totalMarks += mark;
        return totalMarks;
    }

    public float average(int... sub) {
        return (float) total(sub) / sub.length;
    }

    public String grade(float avg) {

        if (avg >= 90) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

}

class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.rollNumber=1;
        student.name="John";
        student.course="B.Tech";
        student.mark1=90;
        student.mark2=80;
        student.mark3=70;

        System.out.println("Total Marks of " + student.name + " is: " + student.total(student.mark1, student.mark2, student.mark3));
        System.out.println("Average Marks of " + student.name + " is: " + student.average(student.mark1, student.mark2, student.mark3));
        System.out.println("Grade of " + student.name + " is: " + student.grade(student.average(student.mark1, student.mark2, student.mark3)));



    }
}
