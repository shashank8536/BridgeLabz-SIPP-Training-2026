public class MergeSortedLogStreams {

    static class Node {
        int timestamp;
        String message;
        Node next;

        Node(int timestamp, String message) {
            this.timestamp = timestamp;
            this.message = message;
            this.next = null;
        }
    }

    static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0, "");
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.timestamp <= b.timestamp) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;

        return dummy.next;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print("[" + temp.timestamp + ": " + temp.message + "] -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Stream A: 10 -> 25 -> 40
        Node streamA = new Node(10, "Service A: Starting");
        streamA.next = new Node(25, "Service A: Initialized");
        streamA.next.next = new Node(40, "Service A: Done");

        // Stream B: 15 -> 20 -> 35
        Node streamB = new Node(15, "Service B: Listening");
        streamB.next = new Node(20, "Service B: Connection Recv");
        streamB.next.next = new Node(35, "Service B: Response Sent");

        System.out.print("Stream A: ");
        display(streamA);

        System.out.print("Stream B: ");
        display(streamB);

        Node merged = mergeLogStreams(streamA, streamB);

        System.out.print("Merged Time-Ordered Stream: ");
        display(merged);
    }
}
