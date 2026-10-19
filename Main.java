
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList playlist = new SinglyLinkedList();

        playlist.addLast(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addLast(new Song("God's Plan", "Drake", 198));
        playlist.addLast(new Song("SICKO MODE", "Travis Scott", 312));

        System.out.println("=== Original Playlist ===");

        for (Song song : playlist) {
            System.out.println(song);
        }

        Iterator<Song> iterator = playlist.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();

            if (song.getTitle().equals("God's Plan")) {
                iterator.remove();
                System.out.println("\nRemoved: " + song.getTitle());
            }
        }

        System.out.println("\n=== Updated Playlist ===");

        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}
