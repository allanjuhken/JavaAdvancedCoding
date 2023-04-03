package task7;

public class Employee {
    private String firstName;
    private String lastNAme;
    private double salary;
    private int age;

    public Employee(String firstName, String lastNAme, double salary, int age) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
