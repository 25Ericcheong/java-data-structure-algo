package main.lists.vectors;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("Mary", "Jones", 456));
        employeeList.add(new Employee("Jane", "Jones", 22));
        employeeList.add(new Employee("Mike", "Jones", 3245));
    }
}
