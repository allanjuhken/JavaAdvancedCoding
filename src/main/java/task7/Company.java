package task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Company {
    private List<Employee> employeeList;

    public Company(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee...employees){
        employeeList.addAll(Arrays.asList(employees));
    }

    public double getAverageSalary(){
        // initialize a sum variable to zero
        double sumSalary = 0;
        // loop through components and accumulate the sum
        for (Employee employee : employeeList) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employeeList.size();
    }

    public Employee getOldestEmployee(){
        // initialize the first employee as oldest
        Employee oldest = employeeList.get(0);
        // compare the other employees to find out the real oldest
        // and store the value int the variable above
        for (Employee employee : employeeList){
            if (employee.getAge() > oldest.getAge()) {
                oldest = employee;
            }
        }
        // return the oldest after the iteration is done
        return oldest;
    }

    public Employee getRandomEmployee(){
        Random random = new Random();
        int index = random.nextInt(employeeList.size()); // see määrab randomi ülemise otsa
        return employeeList.get(index);
    }

}
