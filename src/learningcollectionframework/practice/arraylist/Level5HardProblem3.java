package learningcollectionframework.practice.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Level5HardProblem3 {
    static void main() {

//        25. Student Management System
//        Create a Student class:
//        class Student {
//            int id;
//            String name;
//            double marks;
//        }
//        Store studentsList in: ArrayList<Student>
//        Features:
//        Add student
//        Delete student
//        Search by ID
//        Find topper
//        Sort by marks

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1, "Summi", 100));
        studentsList.add(new Student(2, "Hemant", 70));
        studentsList.add(new Student(3, "Mukesh", 30));

        System.out.println("\nStudents List");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        ArrayList<Student> anotherStudentsList = new ArrayList<>();
        anotherStudentsList.add(new Student(4, "Anshal", 90));
        anotherStudentsList.add(new Student(5, "Neel", 80));
        anotherStudentsList.add(new Student(6, "Abhishek", 60));

        System.out.println("\nAnother Students List");
        for (Student student : anotherStudentsList) {
            System.out.println(student);
        }

        StudentMGMT studentMGMT = new StudentMGMT(studentsList);
        studentMGMT.addStudent(anotherStudentsList);

        ArrayList<Student> students3 = new ArrayList<>();
        students3.add(new Student(6, "Abhishek", 60));
        studentMGMT.deleteStudent(students3);

        System.out.println("\nSearched student by id:\n" + studentMGMT.searchById(2));
        System.out.println("\nTopper: \n" + studentMGMT.findTopper());

        System.out.println("\nSorted by marks: ");

        studentMGMT.sortByMarks();

    }
}

class StudentMGMT {

    ArrayList<Student> students;

    public StudentMGMT(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(ArrayList<Student> newStudents) {
        students.addAll(newStudents);
        System.out.println("\nAdded new student list to existing list: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void deleteStudent(ArrayList<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < this.students.size(); j++) {
                if (students.get(i).id == this.students.get(j).id) {
                    this.students.remove(this.students.get(j));
                }
            }
        }
        System.out.println("\nList after removal: ");
        for (Student student : this.students) {
            System.out.println(student);
        }
    }

    public Student searchById(int id) {
        Student matchStudent = null;
        for (Student student : students) {
            if (student.id == id) {
                matchStudent = student;
            }
        }
        return matchStudent;
    }

    public Student findTopper() {
        double maxMarks = Double.MIN_VALUE;
        Student topper = null;
        for (Student student : students) {
            if (student.marks > maxMarks) {
                maxMarks = student.marks;
                topper = student;
            }
        }
        return topper;
    }

    public void sortByMarks() {
        ArrayList<Student> sortedStudents = new ArrayList<>();
        while (students.iterator().hasNext()) {
            Student minMarksStudent = students.get(0);
            for (int j = 1; j < students.size(); j++) {
                if (students.get(j).marks < minMarksStudent.marks) {
                    minMarksStudent = students.get(j);
                }
            }
            sortedStudents.addFirst(minMarksStudent);
            students.remove(minMarksStudent);
        }
        for (Student student : sortedStudents) {
            System.out.println(student);
        }
    }
}

class Student {

    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Id:" + id + ", Name:" + name + ", Marks:" + marks;
    }
}
