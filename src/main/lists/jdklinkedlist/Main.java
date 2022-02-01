package main.lists.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Mary", "Jones", 456);
        Employee marySmith = new Employee("Jane", "Jones", 22);
        Employee mikeWilson = new Employee("Mike", "Jones", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.println("HEAD ->");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        list.addLast(billEnd);
        iter = list.iterator();
        System.out.println("HEAD ->");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();
        iter = list.iterator();
        System.out.println("HEAD ->");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
        // or with a for loop
        // for (Employee employee: list) {
        //      System.out.println(employee);
        // }
    }
}
