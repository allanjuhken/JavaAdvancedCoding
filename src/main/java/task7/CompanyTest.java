package task7;

public class CompanyTest {
    public static void main(String[] args) {

        Employee fred = new Employee("fred", "fiöösä", 150000, 55);
        Employee karl = new Employee("karl","kabi", 12000,35);
        Employee ove = new Employee("ove","ovaal",12500,25);
        Employee tiina = new Employee("tiina","tutt",32000,33);
        Employee miina = new Employee("miina","minister",52000,46);

        Company google = new Company();

        google.addEmployee(fred,karl,ove,tiina,miina);

        System.out.println("Average salary is: " + google.getAverageSalary());
        System.out.println("Oldest employee is: " + google.getOldestEmployee().getFirstName());
        System.out.println("Night shift tonight: " + google.getRandomEmployee().getFirstName());
    }
}
