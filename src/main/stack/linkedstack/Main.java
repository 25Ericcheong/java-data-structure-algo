package main.stack.linkedstack;

import main.stack.Employee;

public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 456));
        stack.push(new Employee("Mary", "Smith", 789));
        stack.push(new Employee("Mike", "Wilson", 1011122));
        stack.push(new Employee("Bill", "End", 8888));

        stack.printStack();
    }
}
