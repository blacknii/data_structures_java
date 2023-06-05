package sorce_6;

public class Main {
    public static void main(String[] cmd) {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}