package StackProg;

import java.util.*;

public class StackQueue {

    // Driver code
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.enQueue(10);
        q.enQueue(11);
        q.enQueue(12);
        q.enQueue(13);
        q.enQueue(14);
        q.enQueue(15);
        q.enQueue(16);
        q.enQueue(17);
        q.enQueue(18);
        q.enQueue(19);
        q.enQueue(20);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}