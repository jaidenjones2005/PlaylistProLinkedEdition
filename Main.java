
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList playlist = new SinglyLinkedList();

        System.out.println("=== Test 1: Add to Empty List ===");
        playlist.addLast(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.display();

        System.out.println("\n=== Test 2: Remove First Song ===");
        Iterator<Song> iterator = playlist.iterator();

        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        playlist.display();

        System.out.println("\n=== Test 3: Remove Last Song ===");
        playlist.addLast(new Song("God's Plan", "Drake", 198));
        playlist.addLast(new Song("SICKO MODE", "Travis Scott", 312));

        iterator = playlist.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();

            if (!iterator.hasNext()) {
                iterator.remove();
                System.out.println("Removed: " + song.getTitle());
            }
        }

        playlist.display();

        System.out.println("\n=== Test 4: Insert at Index 0 ===");
        playlist.add(0, new Song("HUMBLE.", "Kendrick Lamar", 177));
        playlist.display();

        System.out.println("\n=== Test 5: Invalid Index ===");

        try {
            playlist.get(99);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Correctly caught invalid index.");
        }

        System.out.println("\n=== All Tests Complete ===");
    }
}
