package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level4MediumHardProblem3 {
    static void main() {

//        21. Employee Database
//        Store employee names.
//                Operations:
//                Add employee
//                Delete employee
//                Update employee
//                Search employee

        ArrayList<String> emp = new ArrayList<>();

        Employee employee = new Employee(emp);

        employee.addEmployee("Summi");
        employee.addEmployee("hemant");
        employee.addEmployee("Mukesh");
        employee.addEmployee("Anshal");

        System.out.println("Current employee list: " + emp);

        employee.deleteEmployee("Anshal");
        System.out.println("List after deletion: " + emp);

        employee.updateEmployee("hemant", "Hemant");
        System.out.println("After update: " + emp);

        System.out.println("Is Anshal in the employee list: " + employee.searchEmployee("Anshal"));
    }
}

class Employee {

    ArrayList<String> employee;

    public Employee(ArrayList<String> employee) {
        this.employee = employee;
    }

    public void addEmployee(String name) {
        employee.add(name);
    }

    public void deleteEmployee(String name) {
        employee.remove(name);
    }

    public void updateEmployee(String oldName, String newName) {
        int loc = employee.indexOf(oldName);
        employee.add(loc, newName);
    }

    public boolean searchEmployee(String name) {
        return employee.contains(name);
    }

}
