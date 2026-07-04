package learningstaticandfinal;

import java.time.LocalDate;

public class StudentChallengeStudentRollNumber {

    private static final String MALE = "Male";
    private static final String FEMALE = "Female";

    static void main() {
        Student student1 = new Student("Hemant", 36, MALE, "B+", "Computer Science");
        Student student2 = new Student("Summi", 33, FEMALE, "B+", "Biology - Medical");
        Student student3 = new Student("Mukesh", 36, MALE, "O+", "Oil & Gas Dept.");
        Student student4 = new Student("Anshal", 37, MALE, "O+", "Civil Engineering");
        System.out.println("\nNumber of students in KIIT University: " + Student.getCOUNT() + "\n");
        System.out.println(student1 + "\n\n" + student2 + "\n\n" + student3 + "\n\n" + student4);
    }
}


class Student {

    private static int COUNT = 0;
    private final String rollNumber;
    private final String name;
    private final int age;
    private final String gender;
    private final String bloodGroup;
    private final String course;
    private String phoneNumber;

    public Student(String name, int age, String gender, String bloodGroup, String course) {
        rollNumber = generateRollNumber();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.course = course;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    private static String generateRollNumber() {
        LocalDate date = LocalDate.now();
        final String prefix = "KIIT";
        final String separator = "-";
        return prefix + separator + date.getYear() + separator + String.format("%04d", ++COUNT);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String toString() {
        return "Roll: " + rollNumber + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "Course: " + course + "\n" + "Blood Group: " + bloodGroup + "\n" + "Phone Number: " + phoneNumber;
    }

}