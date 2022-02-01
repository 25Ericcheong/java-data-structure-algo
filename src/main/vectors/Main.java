package main.lists.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("Mary", "Jones", 456));
        employeeList.add(new Employee("Jane", "Jones", 22));
        employeeList.add(new Employee("Mike", "Jones", 3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Jon", "Adam", 456));
//        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

        // will be false because we did not implement equal method (before implementing equal method)
        System.out.println(employeeList.contains(new Employee("Mary", "Jones", 456)));
        // with equals method implemented, can now use indexOf method
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
