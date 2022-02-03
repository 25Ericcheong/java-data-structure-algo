package main.queue.arrayqueue;

import main.queue.Employee;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(new Employee("Jane", "Jones", 123));
        queue.add(new Employee("John", "Doe", 456));
        queue.add(new Employee("Mary", "Smith", 789));
        queue.add(new Employee("Mike", "Wilson", 1011122));
        queue.add(new Employee("Bill", "End", 8888));

        queue.printQueue();

        queue.remove();
        queue.printQueue();

        queue.add(new Employee("Eric", "Cheong", 123));
        queue.printQueue();
    }
}
