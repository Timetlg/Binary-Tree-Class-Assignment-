
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

    public Btree() {
        root = null;
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
                
            } else { // go right
                current = current.right;      
            }
            
            if (current == null) {
                return null;
            }
        }
        return current;
    } // End of Node
} // End of Btree
