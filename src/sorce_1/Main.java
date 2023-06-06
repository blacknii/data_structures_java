package sorce_1;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.head = null;
        l.trail = null;
        l.addAtFront(10);
        l.addAtFront(20);
        l.show();
        l.addAtEnd2(30);
        l.show();
        l.addAfterElemAtAdd(l.head, 100);
        l.show();
        l.delFirst();
        l.show();
        l.delLast();
        l.show();
        l.delelemAtAddr(l.head.next);
        l.show();
        l.addAtFront(115);
        l.addAtFront(25);
        l.show();
//        Elem t = l.findX(115);
//        l.delelemAtAddr(t);
        l.deleteByValue(115);
        l.show();
        }
    }