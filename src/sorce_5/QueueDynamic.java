package sorce_5;

public class QueueDynamic {
    int[] array;
    int first;
    int last;
    int currentSize;

    QueueDynamic(int maxSize) {
        array = new int[maxSize];
        currentSize = 0;
        first = -1;
        last = -1;
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return currentSize == array.length;
    }

    void enQueue(int x) {
        if (isFull()) {
            throw new RuntimeException("ASASAS");
        }

        if (isEmpty()) {
            first = 0;
            last = 0;
        } else {
            last = (last + 1) % array.length;
        }
        array[last] = x;
        currentSize++;
    }

    int deQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int t = array[first];
        first = (first + 1) % array.length;
        currentSize--;
        return t;
    }

    int first() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return array[first];
    }

    int last() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return array[last];
    }
}
