package PriorityQ;

import PriorityQ.Element;

import java.util.PriorityQueue;

public class PQElement {
    public static void main(String[] args) {
        /*
           The requirement for a PriorityQueue of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the PriorityQueue.
        */

        // Create a PriorityQueue
        PriorityQueue<Element> PQ = new PriorityQueue<>();

        // Add items to the Priority Queue
        PQ.add(new Element("Terje", 5));
        PQ.add(new Element("Kari", 7));
        PQ.add(new Element("Nils", 4));
        PQ.add(new Element("Otto", 8));
        PQ.add(new Element("Syvert", 7));
        PQ.add(new Element("Lise", 11));
        PQ.add(new Element("Notto", 0));
        PQ.add(new Element("Odd", 1));
        PQ.add(new Element("Even", 2));

        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
        while (!PQ.isEmpty()) {
            System.out.println(PQ.remove());
        }
    }
}
