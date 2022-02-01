package main.lists.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Mary", "Jones", 456);
        Employee marySmith = new Employee("Jane", "Jones", 22);
        Employee mikeWilson = new Employee("Mike", "Jones", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
    }
}
