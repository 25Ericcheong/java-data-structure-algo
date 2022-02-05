package main.search.heap.priorityqueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(35);
        pq.add(-55);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(49);

        // this is a min heap, so smallest value will be at root
//        System.out.println(pq.peek());
//        pq.remove();
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());

        Object[] ints = pq.toArray();
        for (Object num: ints) {
            System.out.println(num);
        }
    }
}
