package linear.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by southouse
 * Created on 2/24/2021.
 **/
class QueueTest {

    @Test
    void enqueue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
    }

    @Test
    void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            queue.dequeue();
        });
    }

}