package sorce_3;

public class Stack {
    int[] array;
    int top;

    Stack(int size) {
        array = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == array.length - 1;
    }

    void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        array[top] = x;
    }

    int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    int size() {
        return top + 1;
    }
}
