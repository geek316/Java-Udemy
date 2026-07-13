package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level4MediumHardProblem1 {
    static void main() {

//        19. Student Marks Manager
//        Create: ArrayList<Integer> marks
//        Features:
//        Add mark
//        Remove mark
//        Update mark
//        Find average
//        Find highest mark

        ArrayList<Integer> marks = new ArrayList<>();

        StudentMarksManager marksManager = new StudentMarksManager(marks);
        marksManager.addMarks(10);
        marksManager.addMarks(20);
        marksManager.addMarks(30);
        marksManager.addMarks(40);
        marksManager.addMarks(50);
        marksManager.addMarks(80);

        System.out.println("Marks of student: " + marks);

        marksManager.removeMark(80);
        marksManager.updateMark(10, 11);

        System.out.println("Marks after removal and update: " + marks);
        System.out.println("Average mark of student: " + marksManager.findAverage());
        System.out.println("Highest mark of student: " + marksManager.findHighestMark());
    }
}

class StudentMarksManager {

    ArrayList<Integer> marks;

    public StudentMarksManager(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void addMarks(Integer mark) {
        marks.add(mark);
    }

    public void removeMark(Integer mark) {
        marks.remove(mark);
    }

    public void updateMark(Integer oldMark, Integer newMark) {
        int oldPos = marks.indexOf(oldMark);
        marks.remove(oldMark);
        marks.add(oldPos, newMark);
    }

    public Integer findAverage() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public Integer findHighestMark() {

        int max = Integer.MIN_VALUE;
        for (Integer mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

}
