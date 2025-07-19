public class Question28_1 {
      static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;

    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
