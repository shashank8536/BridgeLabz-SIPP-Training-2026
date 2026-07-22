public class RemoveTaskQueue {

    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
            this.next = null;
        }
    }

    static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print("Task_" + temp.taskId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating task queue: Task_1 -> Task_2 -> Task_3 -> Task_4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original task queue: ");
        display(head);

        // Remove Task 3 (middle node)
        head = removeTask(head, 3);
        System.out.print("After removing Task 3: ");
        display(head);

        // Remove Task 1 (head node)
        head = removeTask(head, 1);
        System.out.print("After removing Task 1: ");
        display(head);
    }
}
