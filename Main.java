
public class Main {
    public static void main(String[] args) {

        SinglyLinkedList playlist = new SinglyLinkedList();

        playlist.addLast(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addLast(new Song("God's Plan", "Drake", 198));
        playlist.addLast(new Song("SICKO MODE", "Travis Scott", 312));

        System.out.println("=== Playlist Pro ===");
        playlist.display();
    }
}
