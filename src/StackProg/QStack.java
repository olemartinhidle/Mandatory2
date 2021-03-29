package StackProg;

import java.util.Stack;

public class QStack {

    static void pushStack(Stack<Integer> top_ref, int new_data)
    {
        // Push the data onto the stack
        top_ref.push(new_data);
    }

    /* Function to pop an item from stack*/
    static int popStack(Stack<Integer> top_ref)
    {
        /*If stack is empty then error */
        if (top_ref.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }

        // pop the data from the stack
        return top_ref.pop();
    }

    // Function to enqueue an item to the queue
    static void enQueue(Queue q, int x)
    {
        pushStack(q.stack1, x);
    }

    /* Function to deQueue an item from queue */
    static int deQueue(Queue q)
    {
        int x;

        /* If both stacks are empty then error */
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }

        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = popStack(q.stack1);
                pushStack(q.stack2, x);
            }
        }
        x = popStack(q.stack2);
        return x;
    }

    /* Driver function to test above functions */
    public static void main(String args[])
    {
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
        enQueue(q, 4);
        enQueue(q, 5);
        enQueue(q, 6);
        enQueue(q, 7);
        enQueue(q, 8);
        enQueue(q, 9);
        enQueue(q, 10);
        enQueue(q, 11);
        enQueue(q, 12);
        enQueue(q, 13);
        enQueue(q, 14);
        enQueue(q, 15);
        enQueue(q, 16);
        enQueue(q, 17);
        enQueue(q, 18);
        enQueue(q, 19);
        enQueue(q, 20);

        /*
        Her kan det legges til popStack og pushStack metoder
        */
   //     System.out.print(popStack() + " --> Pop stack ");

   //     System.out.print(pushStack() + " --> Push stack ");

        System.out.print(deQueue(q) + " removed ");
        System.out.print(deQueue(q) + " removed ");
        System.out.print(deQueue(q) + " removed ");

        System.out.println("Still: " + q.stack2 + " is pushed to queue ");

        System.out.print( "Next: " + deQueue(q) + " just popped, then: ");

        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");


        System.out.print(deQueue(q) + " ");
    }
}

