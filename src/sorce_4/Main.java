package sorce_4;

public class Main {
    public static void main(String[] args) {
        StackDynamic s = new StackDynamic();
        s.push(30);
        s.push(20);
        s.push(120);
        s.push(434);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}