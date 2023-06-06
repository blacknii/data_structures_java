package sorce_7;

public class BST {
    Elem root;

    BST() {
        root = null;
    }

    void add(int x) {
        Elem new_node = new Elem(x);
        if (root == null) {
            root = new_node;
            return;
        }
        Elem temp = root;
        while (true) {
            if (x < temp.data) {
                if (temp.left == null) {
                    temp.left = new_node;
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = new_node;
                    return;
                }
                temp = temp.right;
            }
        }
    }

    Elem addRecursive(Elem e, int x) {
        if (e == null) {
            return new Elem(x);
        }
        if (x < e.data) {
            e.left = addRecursive(e.left, x);
        } else if (x > e.data) {
            e.right = addRecursive(e.right, x);
        }
        return e;
    }

    void inorderRecursive(Elem e) {
        if (e == null) {
            return;
        }
        inorderRecursive(e.left);
        System.out.print(e.data + " ");
        inorderRecursive(e.right);
    }

    void preorderRecursive(Elem e) {
        if (e == null) {
            return;
        }
        System.out.print(e.data + " ");
        preorderRecursive(e.left);
        preorderRecursive(e.right);
    }

    void postorderRecursive(Elem e) {
        if (e == null) return;
        postorderRecursive(e.left);
        postorderRecursive(e.right);
        System.out.print(e.data + " ");
    }

    Elem find(int x) {
        Elem temp = root;
        while (temp != null) {
            if (temp.data == x) {
                return temp;
            }
            if (x < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return null;
    }

    Elem findRecursive(Elem e, int x) {
        if (e == null) {
            return null;
        }
        if (e.data == x) {
            return e;
        }
        if (x < e.data) {
            return findRecursive(e.left, x);
        } else {
            return findRecursive(e.right, x);
        }
    }

    Elem findMinimumAddr() {
        if (root == null) return null;
        Elem temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    Elem findMinimumRecursive(Elem e) {
        if (e == null) {
            return null;
        }
        if (e.left == null) {
            return e;
        }
        return findMinimumRecursive(e.left);
    }

    Elem findMaximumAddr() {
        if (root == null) return null;
        Elem temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    Elem findMaximumRecursive(Elem e) {
        if (e == null) {
            return null;
        }
        if (e.left == null) {
            return e;
        }
        return findMaximumRecursive(e.right);
    }

    Elem parent(Elem p) {
        if (p == root) {
            return null;
        }
        Elem temp = root;
        while (temp.left != p && temp.right != p) {
            if (p.data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }

    Elem predprecessor(Elem p) {
        if (p.left != null) {
            return findMaximumRecursive(p.left);
        }
        Elem temp = p;
        while (temp != null && temp.right != p) {
            p = temp;
            temp = parent(temp);
        }
        return temp;
    }

    Elem sucessor(Elem p) {
        if (p.right != null) {
            return findMinimumRecursive(p.right);
        }
        Elem temp = p;
        while (temp != null && temp.left != p) {
            p = temp;
            temp = parent(temp);
        }
        return temp;
    }

    Elem delete(Elem p) {
        if (root == null) {
            return null;
        }
        if (p.left == null && p.right == null) {
            if (p == root) {
                root = null;
                return null;
            }
            Elem temp = parent(p);
            if (temp.left == p) {
                temp.left = null;
            } else {
                temp.right = null;
            }
            return root;
        }
        if (p.left == null || p.right == null) {
            if (p == root) {
                if (p.left == null) {
                    root = p.right;
                } else {
                    root = p.left;
                }
                return root;
            }
            Elem temp = parent(p);
            if (temp.left == p) {
                if (p.left == null) {
                    temp.left = p.right;
                } else {
                    temp.left = p.left;
                }
            } else {
                if (p.left == null) {
                    temp.right = p.right;
                } else {
                    temp.right = p.left;
                }
            }
            return root;
        }
        Elem pre = predprecessor(p);
        p.data = pre.data;
        delete(pre);
        return root;
    }

    int countNodes(Elem e) {
        if (e == null) {
            return 0;
        } else {
            return 1 + countNodes(e.left) + countNodes(e.right);
        }
    }
}