package sorce_1;

public class Lista {
    Elem head;
    Elem trail;

    void show() {
        Elem temp = head;
        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtFront(int l) {
        Elem q = new Elem();
        q.data = l;
        q.next = head;
        if (head == null) trail = q;
        head = q;
    }

    void addAtFront2(int l) {
        Elem q = new Elem();
        q.data = l;
        q.next = head;
        head = q;
    }

    void addAtEnd(int l) {
        Elem q = new Elem();
        q.data = l;
        q.next = null;
        if (head == null) {
            head = q;
            trail = q;
            return;
        }
        trail.next = q;
    }

    void addAtEnd2(int l) {
        Elem q = new Elem();
        q.data = l;
        q.next = null;
        if (head == null) {
            head = q;
            return;
        }
        Elem temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = q;
    }

    void addAfterElemAtAdd(Elem p, int l) {
        Elem q = new Elem();
        if (p == trail) trail = q;
        q.data = l;
        q.next = p.next;
        p.next = q;
    }

    void addAfterElemAtAdd2(Elem p, int l) {
        Elem q = new Elem();
        q.data = l;
        q.next = p.next;
        p.next = q;
    }

    void delFirst() {
        if (head == null) {
            System.out.println("Blad - lista pusta");
            return;
        }
        head = head.next;
    }

    void delLast() {
        if (head == null) {
            System.out.println("Blad - lista pusta");
            return;
        }
        if (head.next == null) {
            head = null;
            trail = null;
            return;
        }

        Elem temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        trail = temp;
    }

    void delLast2() {
        if (head == null) {
            System.out.println("Blad - lista pusta");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Elem temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void delelemAtAddr(Elem p) {
        if (p == head) {
            head = head.next;

            return;
        }
        Elem temp = head;
        while (temp.next != p) {
            temp = temp.next;
        }

        if (temp.next == trail) trail = temp;

        temp.next = p.next;
    }

    void delelemAtAddr2(Elem p) {
        if (p == head) {
            head = head.next;

            return;
        }
        Elem temp = head;
        while (temp.next != p) {
            temp = temp.next;
        }

        temp.next = p.next;
    }

    Elem findX(int x) {
        Elem temp = head;
        while (temp != null) {
            if (temp.data == x) return temp;
            temp=temp.next;
        }
        return null;
    }

}

