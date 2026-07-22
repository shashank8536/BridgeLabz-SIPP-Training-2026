public class InsertTrackPlaylistQueue {

    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
            this.next = null;
        }
    }

    static void insertAfter(Node current, int trackId) {

        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating playlist: 101 -> 102 -> 104
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(104);

        System.out.print("Original playlist queue: ");
        display(head);

        // Insert track 103 after track 102
        insertAfter(head.next, 103);

        System.out.print("Updated playlist queue: ");
        display(head);
    }
}
