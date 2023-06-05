package sorce_5;

public class Main {
    public static void main(String[] args) {
        QueueDynamic q = new QueueDynamic(100);
        q.enQueue(10);
        q.enQueue(5);
        q.enQueue(20);
        System.out.println(q.first());
        System.out.println(q.last());
        System.out.println("------------");
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}