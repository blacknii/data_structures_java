package sorce_2;

public class ListaDwukierunkowa {
    Elem head;

    ListaDwukierunkowa() {
        head = null;
    }

    void addFirst(int x) {
        Elem new_node = new Elem();
        new_node.data = x;
        new_node.prev = null;
        new_node.next = head;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    void addLast(int x) {
        if (head == null) {
            addFirst(x);
            return;
        }

        Elem new_node = new Elem();
        new_node.data = x;
        new_node.next = null;

        Elem current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new_node;
        new_node.prev = current;
    }

    void show() {
        Elem temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
