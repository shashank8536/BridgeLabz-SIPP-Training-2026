public class FindMiddleServer {

    static class Node {
        String serverName;
        Node next;

        Node(String serverName) {
            this.serverName = serverName;
            this.next = null;
        }
    }

    static Node findMiddleServer(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Creating server chain: ServerA -> ServerB -> ServerC -> ServerD -> ServerE
        Node head = new Node("ServerA");
        head.next = new Node("ServerB");
        head.next.next = new Node("ServerC");
        head.next.next.next = new Node("ServerD");
        head.next.next.next.next = new Node("ServerE");

        System.out.println("Relay chain: ServerA -> ServerB -> ServerC -> ServerD -> ServerE");

        Node middle = findMiddleServer(head);

        if (middle != null) {
            System.out.println("Middle Server node found: " + middle.serverName);
        } else {
            System.out.println("Server chain is empty.");
        }
    }
}
