package linear.stack;


/**
 * Created by southouse
 * Created on 2/23/2021.
 **/
public class ListNodeStack {

    private Node head;
    private int maxSize;
    private int size;

    ListNodeStack() {
        this.head = null;
        this.maxSize = 10;
        this.size = 0;
    }

    ListNodeStack(int maxSize) {
        this.head = null;
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void push(int data) {
        if (maxSize <= size)
            throw new ArrayIndexOutOfBoundsException("is full");

        if (head == null) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            Node lastNode = getNodeAtLast();
            lastNode.next = node;
        }

        size++;
    }

    public int pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("is empty");
        }

        int removeData;
        if (size == 1) {
            removeData = head.data;
            head = null;
        } else {
            Node node = getNodeAtPosition(size - 1);
            removeData = node.next.data;
            node.next = null;
        }
        size--;
        return removeData;
    }

    private Node getNodeAtPosition(int position) {
        if (position > maxSize)
            throw new ArrayIndexOutOfBoundsException("Not exist position");

        Node node = head;
        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        return node;
    }

    private Node getNodeAtLast() {
        Node node = head;
        for (int i = 0; i < size - 1; i++) {
            node = node.next;
        }

        return node;
    }

    @Override
    public String toString() {
        return "ListNodeStack{" +
                "head=" + head +
                ", maxSize=" + maxSize +
                ", size=" + size +
                '}';
    }

}
