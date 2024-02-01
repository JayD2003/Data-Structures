public class llmain {
    Node head;
    private int size;

    llmain() {
        this.size = 0;
    }

    public class Node {
        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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

    //delete first
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast() {

        //checking head
        if (head == null) {
            System.out.print("Linked List is empty");
            return;
        }

        size--;
        //checking if list has only one element
        if (head.next == null) {
            head = null;
            return;
        }

        Node LastSecondNode = head;
        Node LastNode = head.next;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            LastSecondNode = LastSecondNode.next;
        }
        LastSecondNode.next = null;
    }

    //printing the linkedlist
    public void printlist() {
        //checking the head
        if (head == null) {
            System.out.print("Linked List is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    //to return size of the linked list
    public int getSize() {
        return size;
    }

    //to reverse the linkedlist
    public void reverseList() {
        
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        llmain l = new llmain();
        l.addLast("hi");
        l.addLast("this");
        l.addLast("is");
        l.addLast("jay");
        System.out.println();
        l.printlist();
        l.reverseList();
        System.out.println();
        l.printlist();
        System.out.println(l.getSize());
    }
}