public class ReverseHistoryStack {

    static class Node {
        String pageUrl;
        Node next;

        Node(String pageUrl) {
            this.pageUrl = pageUrl;
            this.next = null;
        }
    }

    static Node reverseHistory(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.pageUrl + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating history: google.com -> github.com -> StackOverflow.com
        Node head = new Node("google.com");
        head.next = new Node("github.com");
        head.next.next = new Node("stackoverflow.com");

        System.out.print("Original back history (most recent first): ");
        display(head);

        head = reverseHistory(head);

        System.out.print("Reversed history (oldest first):           ");
        display(head);
    }
}
