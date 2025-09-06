public class addTwoList {
    
    Node head; // Add this field to store the head of the list

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addTwoNumbers( Node l1, Node l2){

        Node dummyHead = new Node(0);
        Node p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        return dummyHead.next;

    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
     


    public static void main(String[] args) {
        addTwoList list1 = new addTwoList();
        addTwoList list2 = new addTwoList();

        // Creating first linked list: 2 -> 4 -> 3
        list1.head = new Node(2);
        list1.head.next = new Node(4);
        list1.head.next.next = new Node(3);

        // Creating second linked list: 5 -> 6 -> 4
        list2.head = new Node(5);
        list2.head.next = new Node(6);
        list2.head.next.next = new Node(4);

        Node result = addTwoNumbers(list1.head, list2.head);
        
        // Print the result linked list
        printList(result); // Expected Output: 7 -> 0 -> 8
    }

}
