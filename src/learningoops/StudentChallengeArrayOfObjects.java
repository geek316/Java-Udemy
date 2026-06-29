package learningoops;

import java.util.Arrays;

public class StudentChallengeArrayOfObjects {
    public static void main(String[] args) {

        Subject[] subjects = new Subject[3];
        subjects[0] = new Subject("Sub-101", "Data Structures", 99);
        subjects[1] = new Subject("Sub-102", "Algorithms", 87);
        subjects[2] = new Subject("Sub-103", "System Design", 82);

//        for (Subject s : subjects) {
//            System.out.println(s);
//        }

        Student student = new Student("1", "John", "CSE", subjects);

        System.out.println(student);
    }
}

class Subject {

    private final String subjectId;
    private final String name;
    private final int maxMarks;
    private int marksObtained;

    public Subject(String subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtained = 0;
    }

    public Subject(String subjectId, String name, int marksObtained) {
        this.subjectId = subjectId;
        this.name = name;
        this.maxMarks = 100;
        setMarksObtained(marksObtained);
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public boolean isQualified() {
        return marksObtained >= 40;
    }

    public String toString() {
        return "\n\tSubject ID: " + subjectId + ", Name: " + name + ", Max Marks: " + maxMarks + ", Marks Obtained: " + marksObtained + ", Qualified: " + isQualified();
    }

}

class Student {

    private final String rollNo;
    private final String name;
    private String dept;
    private Subject[] subjects;

    public Student(String rollNo, String name, String dept, Subject[] subjects) {
        this.rollNo = rollNo;
        this.name = name;
        setDept(dept);
        setSubjects(subjects);
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject... subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        return "\nRoll No: " + rollNo + ", Name: " + name + ", Dept: " + dept + ", Subjects: " + Arrays.toString(subjects);
    }

}

