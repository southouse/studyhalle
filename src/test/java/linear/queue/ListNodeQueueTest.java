package linear.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by southouse
 * Created on 2/25/2021.
 **/
class ListNodeQueueTest {

    @Test
    void enqueue() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.enqueue(10);
        listNodeQueue.enqueue(20);
        listNodeQueue.enqueue(30);
        listNodeQueue.enqueue(40);
        System.out.println(listNodeQueue);
    }

    @Test
    void dequeue() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.enqueue(10);
        listNodeQueue.enqueue(20);
        listNodeQueue.enqueue(30);
        listNodeQueue.dequeue();
        System.out.println(listNodeQueue);
        listNodeQueue.dequeue();
        listNodeQueue.dequeue();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            listNodeQueue.dequeue();
        });
    }

}