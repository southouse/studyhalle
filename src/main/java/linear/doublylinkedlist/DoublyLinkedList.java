package linear.doublylinkedlist;

/**
 * Created by southouse
 * Created on 2/22/2021.
 **/
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        size++;
        if (head.next == null) tail = head;
    }

    public void addLast(Object input) {
        if (size == 0) {
            addFirst(input);
        } else {
            Node newNode = new Node(input);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void add(Object input, int position) {
        // 제일 앞에 넣는 케이스
        if (position == 0) {
            addFirst(input);
        // 제일 끝에 넣는 케이스
        } else if (position == size) {
            addLast(input);
        } else {
            Node prevNode = node(position - 1);
            Node nextNode = prevNode.next;
            Node newNode = new Node(input);
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            if (nextNode != null) nextNode.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;

        size--;
    }

    public void removeLast() {
        Node node = head;
        for (int i = 0; i < size - 2; i++) {
            node = node.next;
        }

        tail = node;
        node.next = null;
        size--;
    }

    public void remove(int position) {
        // 제일 앞에 넣는 케이스
        if (position == 0) {
            removeFirst();
            // 제일 끝에 넣는 케이스
        } else if (position == size) {
            removeLast();
        } else {
            Node prevNode = node(position - 1);
            Node positionNode = node(position);

            prevNode.next = positionNode.next;
            positionNode.next.prev = prevNode;
            size--;
        }

    }

    Node node(int index) {
        if (size < index)
            throw new IllegalArgumentException("size보다 큰 index");

        Node node = null;

        if (index < size / 2) {
            node = head;
            for (int i = 0; i < index; i++) node = node.next;
        } else {
            node = tail;
            for (int i = size; i > index; i--) node = node.prev;
        }

        return node;
    }

    public String toString() {
        if(head == null)
            return "[]";

        Node node = head;
        String str = "[";

        while(node.next != null) {
            str += node.data + ", ";
            node = node.next;
        }
        str += node.data;

        return str + "]";
    }
}
