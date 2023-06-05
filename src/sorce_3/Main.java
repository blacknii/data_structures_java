package sorce_3;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(100);
        s.push(10);
        s.push(20);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}