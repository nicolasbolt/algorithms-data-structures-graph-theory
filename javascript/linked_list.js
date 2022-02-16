class Node {
    constructor(data) {
        this.nextNode = null;
        this.data = data;
    }

    printNode() {
        return `Node data: ${this.data}`;
    } 
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    isEmpty() {
        return this.head == null;
    }

    /**
     * Returns number of nodes in the list
     * Takes O(n) time
     * @return {number}
     **/
    size() {
        let current = this.head;
        let count = 0;

        while (current) {
            count++;
            current = current.nextNode;
        }

        return count;
    }

    /**
     * Adds a new node containing data at the head of the list
     * Takes O(1) time
     * @param data - new data to add to list
     */
    add(data) {
        const newNode = new Node(data);
        newNode.nextNode = this.head;
        this.head = newNode;
    }

    /**
     * Search for the first node containing data that matches the key
     * @param key - search value
     * @return {Node} - the first found node
     * @return {null} - if no node is found
     */
    search(key) {
        let current = this.head;

        while (current) {
            if (current.data === key) {
                return current;
            }

            current = current.nextNode;
        }

        return null;
    }

    /**
     * Inserts a new Node with data at index
     * Takes overall O(1) time
     * @param data - new data to add to list
     * @param {number} index - list index
     */
    insert(data, index) {
        if (index === 0) {
            this.add(data);
        }

        // todo fix this
        if (index > 0) {
            const newNode = new Node(data);
            let position = index;
            let current = this.head;

            while(position > 1) {
                current = current.nextNode;
                position--;
            }

            let previousNode = current;
            let nextNode = current.nextNode

            previousNode.nextNode = newNode;
            newNode.nextNode = nextNode;
        }
    }

    /**
     * Removes Node containing data that matches the key
     * @param key - search data for this value
     * @return {Node}
     * @return {null} - if no Node is found that matches the data
     */
    remove(key) {
        let current = this.head;
        let previous = null;
        let found = false;

        while (current && !found) {
            if (current.data === key && current === this.head) {
                found = true;
                this.head = current.nextNode;
            } else if (current.data === key) {
                found = true;
                previous.nextNode = current.nextNode;
            } else {
                previous = current;
                current = current.nextNode;
            }
        }

        return current;
    }

    /**
     * remove the node at the given index
     * Takes O(n) time
     * @param {number} index 
     * @returns Node - returns the deleted node
     */
    removeAtIndex(index) {
        let current = null;
        let position = null;
        let previous = null;

        if (index === 0) {
            const oldHead = this.head;
            this.head = this.head.nextNode;
            return oldHead;
        } else {
            current = this.head;
            position = 0;

            while (position < index) {
                previous = current
                current = current.nextNode;
                position++;
            }

            previous.nextNode = current.nextNode;
            return current;
        }
    }

    /**
     * Returns Node at a given index
     * Takes O(n) time
     * @param {number} index 
     * @returns Node
     */
    nodeAtIndex(index) {
        let current = null;
        let position = null;
        
        if (index === 0) {
            return this.head;
        } else {
            current = this.head;
            position = 0;

            while (position < index) {
                current = current.nextNode;
                position++;
            }

            return current;
        }
    }

    /**
     * Returns a string representation of the list
     * Takes O(n) time
     * @return {string}
     */
    printList() {
        const nodes = [];
        let current = this.head;

        while (current) {
            if (current === this.head) {
                nodes.push(`[Head: ${current.data}]`);
            } else if (current.nextNode === null) {
                nodes.push(`[Tail: ${current.data}]`);
            } else {
                nodes.push(`[${current.data}]`);
            }

            current = current.nextNode;
        }

        return nodes.join('->');
    }
}


// for testing the linked list
function main() {
    linkedList = new LinkedList()
    linkedList.add(1)
    linkedList.add(5)
    linkedList.add(2)
    linkedList.add(9)
    linkedList.add(3)
    linkedList.add(2)
    linkedList.add(8)
    console.log(linkedList.size())
    console.log(linkedList.printList())

    const searchNode = linkedList.search(5)
    console.log(searchNode.printNode())

    linkedList.remove(2)
    console.log(linkedList.size())

    console.log(linkedList.printList())

    linkedList.insert(10, 4)
    console.log(linkedList.size())

    console.log(linkedList.nodeAtIndex(2))

    linkedList.removeAtIndex(0);
    console.log(linkedList.printList())
}

main()