public class Main {

    public static void main(String[] args) {
        // Int Linked List Test
//        CustomIntLinkedList customIntLinkedList = new CustomIntLinkedList();
//        System.out.println(customIntLinkedList.size());
//        customIntLinkedList.add(4);
//        System.out.println(customIntLinkedList.size());
//        customIntLinkedList.add(2);
//        customIntLinkedList.add(6);
//        System.out.println(customIntLinkedList.size());
//
//        IntNode node = customIntLinkedList.search(2);
//        if (node != null) {
//            System.out.println("Node with data: " + node.data + " was found");
//        } else {
//            System.out.println("Node not found");
//        }
//
//        customIntLinkedList.insert(23, 1);
//        System.out.println(customIntLinkedList.size());
//
//        node = customIntLinkedList.search(23);
//        if (node != null) {
//            System.out.println("Node with data: " + node.data + " was found");
//        } else {
//            System.out.println("Node not found");
//        }
//
//        System.out.println(customIntLinkedList.printList());
//
//        customIntLinkedList.removeAtIndex(1);
//        System.out.println(customIntLinkedList.printList());
//
//        System.out.println(customIntLinkedList.getNodeAtIndex(0).data);
//

//        Generic Linked List Test
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("!");
        customLinkedList.add("World");
        customLinkedList.add("Hello");

        System.out.println(customLinkedList.printList());
        System.out.println(customLinkedList.size());

        Node<String> node = customLinkedList.search("Hello");
        if (node != null) {
            System.out.println("Node with data: " + node.data + " was found");
        } else {
            System.out.println("Node not found");
        }

        Node<String> node2 = customLinkedList.search("abc");
        if (node2 != null) {
            System.out.println("Node with data: " + node2.data + " was found");
        } else {
            System.out.println("Node not found");
        }

        customLinkedList.insert("abc", 2);
        System.out.println(customLinkedList.printList());

        customLinkedList.removeAtIndex(2);
        System.out.println(customLinkedList.printList());

        System.out.println(customLinkedList.getNodeAtIndex(0).data);
    }

}
