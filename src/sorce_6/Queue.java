package sorce_6;

public class Queue {
    Elem head;
    Elem tail;

    Queue() {
        head = null;
        tail = null;
    }

    void enQueue(int x) {
        Elem new_node = new Elem();
        new_node.data = x;
        new_node.next = null;
        if (head == null) {
            head = new_node;
            tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    int deQueue() {
        if (head == null) {
            throw new RuntimeException("Queue is empty!!!");
        }
        int d = head.data;
        if (head.next == null) {
            tail = null;
        }
        head = head.next;
        return d;
    }
}