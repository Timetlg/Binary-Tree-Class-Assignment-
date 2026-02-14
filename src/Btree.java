
public class Btree {

    static class Node {

        // unique key variable
        int key = 0;

        // car data
        String make;
        String model;
        String year;
        String color;

        // directions
        public Node left = null;
        public Node right = null;

        // constructor
        public Node(int key, String make, String model,
                String year, String color) {

            this.key = key;
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }
    } // End of class Node

    public Node root;

    // counter
    static int c = -1;

    public Btree() {
        root = null;
        c++;
    }

    // function to create and insert new node
    public void insert(int key, String make, String model,
            String year, String color) {

        // new node
        Node newNode = new Node(key, make, model, year, color);

        boolean run = true;

        if (root == null) {
            root = newNode;
        } else {

            Node current = root;
            Node parent;

            while (run) {

                parent = current;

                if (key < current.key) { // go left if new key < current key

                    current = current.left;

                    if (current == null) {

                        parent.left = newNode;
                        run = false;
                    }
                } else { // go right

                    current = current.right;

                    if (current == null) {

                        parent.right = newNode;
                        run = false;
                    }
                }
            }
        }
    } // End of insert

    public Node find(int key) {

        Node current = root;

        // check if tree is empty
        if (root == null) {
            return null;
        }

        while (current.key != key) {

            if (key < current.key) { //go left
                current = current.left;
                c++;

            } else { // go right
                current = current.right;
                c++;
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    } // End of Find

    public Node delete(int key) {

        Node current = root;
        Node parent = root;
        Node temp = null;

        boolean isLeft = false;

        // is tree empty
        if (root == null) {
            System.out.println("tree is empty");
            return null;
        }

        // look for the key
        while (current.key != key) {

            parent = current;

            if (key < current.key) {

                // go left
                isLeft = true;
                current = current.left;
            } else {
                // go right
                isLeft = false;
                current = current.right;
            }

            if (current == null) {

                System.out.println("*** key not found ***");
                return null;
            }
        } // End of While

        temp = current;

        // node found
        // no children = delete node
        if (current.left == null && current.right == null) {

            if (current == root) {
                root = null;
            } else if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } // if right child is null replace current with left child
        else if (current.right == null) {

            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } // if left child is null replace current with right child
        else if (current.left == null) {

            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } // if there are two children, replace with inorder of successor
        else {

            // get successor node to delete current
            Node successor = getSuccessor(current);

            // connect parent of current to successor
            if (current == root) {
                root = successor;
            } else if (isLeft) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            // connect successor to current left child
            successor.left = current.left;
        }

        return temp;

    } // End of Delete

    private Node getSuccessor(Node deleteNode) {

        Node successorParent = deleteNode;
        Node successor = deleteNode;
        Node current = deleteNode.right;

        while (current != null) {

            successorParent = successor;
            successor = current;
            current = current.left;
        }

        // if successor was not successful
        if (successor != deleteNode.right) {

            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    } // End of getSuccessor
} // End of Btree

        /*
        Notes for future
        Wanted features
        Add find that it can take either key make model year or color and show 
        you what ones are available
        */
