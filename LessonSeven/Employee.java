package LessonSeven;

public class Employee {
    int id;
    public String surname;
    public int age;
    private double salary;
    String department;

    Employee() {
    }

    public Employee(String surname1, int age1) {
        surname = surname1;
        age = age1;
    }

    private Employee(int age1) {
        age = age1;
    }


    public String showSurname() {
        return surname;
    }

    public double showSalary() {
        return salary;
    }

    public int showId() {
        return id;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.showSurname();
        emp.showSalary();
        emp.showId();
        System.out.print(emp.showId() + emp.showSurname() + emp.showSalary());
    }
}
