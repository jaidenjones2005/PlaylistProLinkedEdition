
public class SinglyLinkedList {

    protected static class Node {
        Song data;
        Node next;

        Node(Song data) {
            this.data = data;
            this.next = null;
        }
    }

    protected Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addLast(Song song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
