package main.lists.linkedlist;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Mary", "Jones", 456);
        Employee marySmith = new Employee("Jane", "Jones", 22);
        Employee mikeWilson = new Employee("Mike", "Jones", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
