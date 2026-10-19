# Playlist Pro — Development Journal

## Phase 1: The Connection

In Phase 1, I created a Song class to store song information and built a custom singly linked list using nodes. I implemented methods to add songs to the end of the playlist and display them in order. I tested the list with three songs and confirmed that it worked.

A linked list stores elements differently from an array because each node contains data and a reference to the next node. Arrays store elements in indexed positions, while linked lists connect nodes using references. This allows a linked list to grow dynamically without needing to resize an array.

## Phase 2: The Playback Engine (The Iterable Pattern)

In Phase 2, I updated my SinglyLinkedList class to implement the Iterable interface. This allowed me to use a for-each loop to go through the playlist and display each song. I also created a custom iterator that supports hasNext(), next(), and remove().

When remove() is called, the node containing the song is disconnected from the linked list. The previous node's next reference is updated to point to the node after the removed song. If the first node is removed, the head pointer is updated instead.

The iterator keeps track of the current node, the previous node, and the last returned node so it can remove songs without losing its position in the playlist. I tested this by removing a song and confirming it no longer appeared in the playlist.

## Phase 3: The DJ's Precision (Positional Insertion)

In Phase 3, I added the get() and add() methods to my SinglyLinkedList class. These methods allow me to retrieve songs and insert new songs at specific positions in the playlist. I tested the methods by inserting a new song in the middle of the list and retrieving it using its index.

In an array-based list, inserting an element in the middle usually takes O(n) time because the elements after the insertion point must be shifted. In a singly linked list, inserting a node takes O(1) time once the correct position is found because only the node references need to change. However, finding that position takes O(n) time, so inserting by index is still O(n) overall.

This showed me that linked lists make it easier to connect and rearrange elements without shifting all the existing data.