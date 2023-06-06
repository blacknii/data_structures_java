package sorce_4;

public class StackDynamic {
    Elem head;

    StackDynamic() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(char x) {
        Elem new_node = new Elem();
        new_node.data = x;
        new_node.next = head;
        head = new_node;
    }

    int pop() {
        if (head == null) {
            throw new RuntimeException("stack is empty");
        }
        char data = head.data;
        head = head.next;
        return data;
    }
}
