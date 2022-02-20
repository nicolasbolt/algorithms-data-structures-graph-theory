import java.util.ArrayList;

public class CustomIntLinkedList {
    IntNode head;

    public CustomIntLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        IntNode current = this.head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.nextNode;
        }
        return count;
    }

    public void add(int data) {
        IntNode newNode = new IntNode(data);
        newNode.nextNode = this.head;
        this.head = newNode;
    }

    public IntNode search(int key) {
        IntNode current = this.head;

        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.nextNode;
        }

        return null;
    }

    public void insert(int data, int index) {
        if (index == 0) {
            this.add(data);
        }

        if (index > 0) {
            IntNode newNode = new IntNode(data);

            int position = index;
            IntNode current = this.head;

            while (position > 1) {
                current = current.nextNode;
                position--;
            }

            IntNode previousNode = current;
            IntNode nextNode = current.nextNode;
            previousNode.nextNode = newNode;
            newNode.nextNode = nextNode;
        }
    }

    public void remove(int key) {
        IntNode current = this.head;
        IntNode previous = null;
        boolean found = false;

        while (current != null && !found) {
            if (current.data == key && current == this.head) {
                found = true;
                this.head = current.nextNode;
            } else if (current.data == key) {
                found = true;
                previous.nextNode = current.nextNode;
            } else {
                previous = current;
                current = current.nextNode;
            }
        }
    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            this.head = this.head.nextNode;
        } else {
            IntNode current = this.head;
            int position = 0;
            IntNode previous = null;

            while (position < index) {
                previous = current;
                current = current.nextNode;
                position++;
            }

            previous.nextNode = current.nextNode;
        }
    }

    public IntNode getNodeAtIndex(int index) {
        if (index == 0) {
            return this.head;
        }

        IntNode current = this.head;
        int position = 0;

        while (position < index) {
            current = current.nextNode;
            position++;
        }

        return current;
    }

    public String printList() {
        ArrayList<String> nodes = new ArrayList<>();
        IntNode current = this.head;

        while (current != null) {
            if (current == this.head) {
                nodes.add("[Head: " + current.data + "]");
            } else if (current.nextNode == null) {
                nodes.add("[Tail: " + current.data + "]");
            } else {
                nodes.add("[" + current.data + "]");
            }

            current = current.nextNode;
        }

        return String.join("->", nodes);
    }
}
