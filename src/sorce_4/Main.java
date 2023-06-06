package sorce_4;

public class Main {
    public static void main(String[] args) {
        StackDynamic s = new StackDynamic();
        s.push('a');
        s.push('b');
        s.push('r');
        System.out.print((char)s.pop());
        s.push('j');
        System.out.print((char)s.pop());
        System.out.print((char)s.pop());
        s.push('c');
        s.push('o');
        s.push('u');
        System.out.print((char)s.pop());
        s.push('k');
        System.out.print((char)s.pop());
        System.out.print((char)s.pop());
        System.out.print((char)s.pop());
        s.push('h');
        System.out.print((char)s.pop());
        System.out.print((char)s.pop());
    }
}