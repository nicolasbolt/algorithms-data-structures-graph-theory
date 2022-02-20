import java.util.ArrayList;

public class CustomLinkedList<T> {
    Node<T> head;

    public CustomLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        Node<T> current = this.head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.nextNode;
        }
        return count;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.nextNode = this.head;
        this.head = newNode;
    }

    public Node<T> search(T key) {
        Node<T> current = this.head;

        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.nextNode;
        }

        return null;
    }

    public void insert(T data, int index) {
        if (index == 0) {
            this.add(data);
        }

        if (index > 0) {
            Node<T> newNode = new Node<>(data);

            int position = index;
            Node<T> current = this.head;

            while (position > 1) {
                current = current.nextNode;
                position--;
            }

            Node<T> previousNode = current;
            Node<T> nextNode = current.nextNode;
            previousNode.nextNode = newNode;
            newNode.nextNode = nextNode;
        }
    }

    public void remove(T key) {
        Node<T> current = this.head;
        Node<T> previous = null;
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
            Node<T> current = this.head;
            int position = 0;
            Node<T> previous = null;

            while (position < index) {
                previous = current;
                current = current.nextNode;
                position++;
            }

            previous.nextNode = current.nextNode;
        }
    }

    public Node<T> getNodeAtIndex(int index) {
        if (index == 0) {
            return this.head;
        }

        Node<T> current = this.head;
        int position = 0;

        while (position < index) {
            current = current.nextNode;
            position++;
        }

        return current;
    }

    public String printList() {
        ArrayList<String> nodes = new ArrayList<>();
        Node<T> current = this.head;

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
