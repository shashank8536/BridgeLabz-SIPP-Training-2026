public class DetectRedirectLoop {

    static class Node {
        String url;
        Node next;

        Node(String url) {
            this.url = url;
            this.next = null;
        }
    }

    static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node a = new Node("google.com");
        Node b = new Node("gmail.com");
        Node c = new Node("inbox.google.com");

        a.next = b;
        b.next = c;

        System.out.println("Test 1: Linear redirection (no loops)");
        System.out.println("Loop detected: " + hasRedirectLoop(a));

        // Create cycle: inbox.google.com redirects back to google.com
        c.next = a;

        System.out.println("Test 2: Circular redirection loop created (inbox.google.com -> google.com)");
        System.out.println("Loop detected: " + hasRedirectLoop(a));
    }
}
