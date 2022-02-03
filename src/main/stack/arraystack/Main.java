package main.stack.arraystack;

import main.stack.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 456));
        stack.push(new Employee("Mary", "Smith", 789));
        stack.push(new Employee("Mike", "Wilson", 1011122));
        stack.push(new Employee("Bill", "End", 8888));

        stack.printStack();
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
