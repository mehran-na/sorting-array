import java.time.LocalDate;

public class Employee {
    //Fields :
    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    //Constructors :
    public Employee(int id, String name, double salary, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    //Methods :
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "{" + name + "}";
    }
}
