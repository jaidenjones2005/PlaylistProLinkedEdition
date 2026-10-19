
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Comparator<Song> byTitle =
                Comparator.comparing(Song::getTitle);

        Comparator<Song> byArtist =
                Comparator.comparing(Song::getArtist);

        SortedLinkedList titlePlaylist =
                new SortedLinkedList(byTitle);

        SortedLinkedList artistPlaylist =
                new SortedLinkedList(byArtist);

        Song song1 = new Song("Blinding Lights", "The Weeknd", 200);
        Song song2 = new Song("God's Plan", "Drake", 198);
        Song song3 = new Song("SICKO MODE", "Travis Scott", 312);
        Song song4 = new Song("HUMBLE.", "Kendrick Lamar", 177);

        titlePlaylist.addLast(song3);
        titlePlaylist.addLast(song1);
        titlePlaylist.addLast(song4);
        titlePlaylist.addLast(song2);

        artistPlaylist.addLast(song3);
        artistPlaylist.addLast(song1);
        artistPlaylist.addLast(song4);
        artistPlaylist.addLast(song2);

        System.out.println("=== Sorted by Title ===");
        titlePlaylist.display();

        System.out.println("\n=== Sorted by Artist ===");
        artistPlaylist.display();
    }
}
