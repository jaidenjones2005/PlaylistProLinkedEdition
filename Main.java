
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList playlist = new SinglyLinkedList();

        playlist.addLast(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addLast(new Song("God's Plan", "Drake", 198));
        playlist.addLast(new Song("SICKO MODE", "Travis Scott", 312));

        System.out.println("=== Original Playlist ===");
        playlist.display();

        System.out.println("\n=== Removing a Song ===");

        Iterator<Song> iterator = playlist.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();

            if (song.getTitle().equals("God's Plan")) {
                iterator.remove();
                System.out.println("Removed: " + song.getTitle());
            }
        }

        System.out.println("\n=== Adding a Song at Index 1 ===");

        playlist.add(1, new Song("HUMBLE.", "Kendrick Lamar", 177));

        playlist.display();

        System.out.println("\n=== Getting Song at Index 1 ===");

        System.out.println(playlist.get(1));
    }
}
