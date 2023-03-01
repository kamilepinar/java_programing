package day33_Abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() { // eger bunu yapmazsan error verir cunku abstract classdan inherit yaptin o yuzden work body koyman gerek
        System.out.println(getName() + " is teaching");
    }
}
