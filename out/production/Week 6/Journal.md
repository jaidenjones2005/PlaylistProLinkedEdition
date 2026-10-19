# Playlist Pro — Development Journal

## Phase 1: The Connection

In Phase 1, I created a Song class to store song information and built a custom singly linked list using nodes. I implemented methods to add songs to the end of the playlist and display them in order. I tested the list with three songs and confirmed that it worked.

A linked list stores elements differently from an array because each node contains data and a reference to the next node. Arrays store elements in indexed positions, while linked lists connect nodes using references. This allows a linked list to grow dynamically without needing to resize an array.

## Phase 2: The Playback Engine (The Iterable Pattern)

In Phase 2, I updated my SinglyLinkedList class to implement the Iterable interface. This allowed me to use a for-each loop to go through the playlist and display each song. I also created a custom iterator that supports hasNext(), next(), and remove().

When remove() is called, the node containing the song is disconnected from the linked list. The previous node's next reference is updated to point to the node after the removed song. If the first node is removed, the head pointer is updated instead.

The iterator keeps track of the current node, the previous node, and the last returned node so it can remove songs without losing its position in the playlist. I tested this by removing a song and confirming it no longer appeared in the playlist.

