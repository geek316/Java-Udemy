package learningstaticandfinal;

import java.time.LocalDate;

public class StudentChallengeStudentRollNumber {
    static void main() {
        Student student1 = new Student("John", 20, "Male");
        Student student2 = new Student("Jane", 21, "Female");
        Student student3 = new Student("Mary", 18, "Female");
        Student student4 = new Student("Chris", 28, "Male");
        System.out.println(student1 + "\n\n" + student2 + "\n\n" + student3 + "\n\n" + student4);
    }
}

class Student {

    private static int count = 1;
    private final String rollNumber;
    private final String name;
    private final int age;
    private String course;
    private String gender;
    private String bloodGroup;

    public Student(String name, int age, String gender) {
        rollNumber = generateRollNumber();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private static String generateRollNumber() {
        LocalDate date = LocalDate.now();
        final String prefix = "UNIV";
        final String separator = "-";
        String rollNum = prefix + separator + date.getYear() + separator + count;
        count++;
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String toString() {
        return "Roll Number: " + rollNumber + "\n" + "Name:" + name + "\n" + "Age:" + age + "\n" + "Gender:" + gender + "\n" + "Course:" + course + "\n" + "Blood Group:" + bloodGroup;
    }

}