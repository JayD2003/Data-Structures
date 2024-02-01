public class LinkedList {
    Node head;

    public class Node {
        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        //checking the head
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add - Last
    public void addLast(String data) {
        Node newNode = new Node(data);

        //checking the head
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //printing the linkedlist
    public void printlist() {
        //checking the head
        if (head == null) {
            System.out.print("NULL");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast("hi");
        l.addLast("this");
        l.addLast("is");
        l.addLast("jay");
        l.printlist();
    }
}