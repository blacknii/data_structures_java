package sorce_7;

public class Main {
    public static void main(String[] args) {
        BST t1 = new BST();
        t1.add(50);
        t1.add(30);
        t1.add(100);
        t1.add(25);
        t1.add(40);
        t1.add(80);
        t1.add(35);
        t1.add(250);
        t1.inorderRecursive(t1.root);
        System.out.println();
        System.out.println(t1.countNodes(t1.root));
        Elem t = t1.find(100);
        t1.root = t1.delete(t);
        t1.inorderRecursive(t1.root);
        System.out.println();
        System.out.println(t1.countNodes(t1.root));

    }
}