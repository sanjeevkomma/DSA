import java.util.LinkedList;
import java.util.Queue;

// LinkedList as a Simple Queue
// The LinkedList class in Java implements the Queue interface, providing a basic FIFO queue structure.

public class SimpleQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Dequeue elements
        System.out.println("Removed: " + queue.poll());  // Outputs 1
        System.out.println("Peek: " + queue.peek());     // Outputs 2

        System.out.println("Queue: " + queue);           // Outputs [2, 3]
    }
}
