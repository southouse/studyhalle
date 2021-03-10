package linear.queue;

import java.util.Arrays;

/**
 * Created by southouse
 * Created on 2/23/2021.
 **/
public class Queue {

    private int[] queue;

    public void enqueue(int data) {
        if (queue == null) {
            queue = new int[]{data};
        } else {
            int size = queue.length;
            int[] tmp = queue.clone();
            queue = new int[size + 1];

            System.arraycopy(tmp, 0, queue, 0, size);

            queue[size] = data;
        }
    }

    public int dequeue() {
        if (queue == null)
            throw new ArrayIndexOutOfBoundsException("is empty");

        int size = queue.length;
        if (size == 1) {
            int result = queue[0];
            queue = null;
            return result;
        }

        int[] tmp = queue.clone();
        queue = new int[size - 1];

        if (size > 0)
            System.arraycopy(tmp, 1, queue, 0, size - 1);

        return tmp[0];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
