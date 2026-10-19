
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList implements Iterable<Song> {

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

    @Override
    public Iterator<Song> iterator() {
        return new Iterator<Song>() {

            private Node current = head;
            private Node previous = null;
            private Node lastReturned = null;
            private Node beforeLastReturned = null;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Song next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                beforeLastReturned = previous;
                lastReturned = current;

                Song song = current.data;
                previous = current;
                current = current.next;

                return song;
            }

            @Override
            public void remove() {
                if (lastReturned == null) {
                    throw new IllegalStateException(
                            "Call next() before remove()."
                    );
                }

                if (beforeLastReturned == null) {
                    head = lastReturned.next;
                } else {
                    beforeLastReturned.next = lastReturned.next;
                }

                previous = beforeLastReturned;
                lastReturned = null;
            }
        };
    }
}
