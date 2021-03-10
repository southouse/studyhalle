package linear.queue;

/**
 * Created by southouse
 * Created on 2/24/2021.
 **/
public class ListNodeQueue {

    private Node head;
    private int size = 0;

    public void enqueue(int data) {
        if (size == 0) {
            head = new Node(data);
            size++;
            return;
        }

        getNodeAtLast().next = new Node(data);
        size++;
    }

    public int dequeue() {
        if (size == 0)
            throw new IndexOutOfBoundsException("is empty");

        int returnData;
        if (size == 1) {
            returnData = head.data;
            head = null;
            size--;
            return returnData;
        }

        Node prevNode = getNodeAtPosition(size - 1);
        returnData = prevNode.next.data;
        prevNode.next = null;
        size--;

        return returnData;
    }

    public Node getNodeAtPosition(int position) {
        if (position > size)
            throw new IndexOutOfBoundsException("is over");

        if (position == 1)
            return head;

        Node node = head;
        for (int i = 0; i < position; i++) {
            node = node.next;
        }

        return node;
    }

    public Node getNodeAtLast() {
        Node node = head;
        for (int i = 0; i < size; i++) {
            node = node.next;
        }

        return node;
    }

    @Override
    public String toString() {
        return "ListNodeQueue{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
