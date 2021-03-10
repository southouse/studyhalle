package linear.stack;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/**
 * Created by southouse
 * Created on 2/23/2021.
 **/
public class Stack {

    private int arr[];
    private int maxSize;
    private int size;

    Stack() {
        this.arr = new int[10];
        this.maxSize = 10;
        this.size = 0;
    }

    Stack(int maxSize) {
        this.arr = new int[maxSize];
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void push(int data) {
        if (maxSize <= size)
            throw new ArrayIndexOutOfBoundsException("is full");

        arr[size++] = data;
    }

    public int pop() {
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException("is empty");

        return arr[--size];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                ", maxSize=" + maxSize +
                ", size=" + size +
                '}';
    }
}
