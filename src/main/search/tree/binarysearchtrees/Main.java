package main.search.tree.binarysearchtrees;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverInOrder();

        System.out.println();
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(888));
//
//        System.out.println(intTree.max());
//        System.out.println(intTree.min());

        intTree.delete(15);
        intTree.delete(25);
        intTree.traverInOrder();
    }
}
