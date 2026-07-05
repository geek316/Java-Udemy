package learningmultithreading;

public class StudentChallengeTeacherStudentProblems {
    static void main() {
        WhiteBoard whiteBoard = new WhiteBoard();
        Teacher teacher = new Teacher(whiteBoard);
        Student summi = new Student("Summi", whiteBoard);
        Student hemant = new Student("Hemant", whiteBoard);
        Student mukesh = new Student("Mukesh", whiteBoard);
        Student anshal = new Student("Anshal", whiteBoard);

        teacher.start();
        summi.start();
        hemant.start();
        mukesh.start();
        anshal.start();

    }
}

class Teacher extends Thread {
    static final String name = "Abdul Bari";
    private final WhiteBoard whiteBoard;

    public Teacher(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    public void run() {
        String[] topics = {"Java is a language", "It is OOPs", "It support multithreading", "End"};
        for (String topic : topics) {
            whiteBoard.write(topic);
        }
    }
}

class Student extends Thread {

    String name;
    WhiteBoard whiteBoard;

    public Student(String name, WhiteBoard whiteBoard) {
        this.name = name;
        this.whiteBoard = whiteBoard;
        whiteBoard.attendance();
    }

    public void run() {
        String localText;
        do {
            localText = whiteBoard.read();
            System.out.println(name + " is reading: " + localText);
            System.out.flush();
        }
        while (!localText.equals("End"));
    }
}

class WhiteBoard {
    String text;
    int numberOfStudents = 0;
    int count = 0;

    synchronized public void write(String text) {
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.text = text;
        System.out.println(Teacher.name + " is writing: " + text);
        count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        String localText;
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        localText = text;
        count--;
        notify();
        return localText;
    }

    public void attendance() {
        numberOfStudents++;
    }

}

