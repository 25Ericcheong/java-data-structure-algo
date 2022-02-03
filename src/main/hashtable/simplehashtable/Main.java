package main.hashtable.simplehashtable;

import main.hashtable.Employee;

public class Main {
    public static void main(String[] args) {
        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Jones",new Employee("Jane", "Jones", 123));
        ht.put("Doe",new Employee("John", "Doe", 456));
        ht.put("Smith",new Employee("Mary", "Smith", 789));
        ht.put("Wilson",new Employee("Mike", "Wilson", 1011122));
//        ht.put("Wilson",new Employee("Bill", "End", 8888));
        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
