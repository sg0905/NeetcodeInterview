package Linked_List_Question;


/* Time complexity = O(N) 
    Space Complexity = O(1) ---> Using same Node
*/
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Rev_LinkedList_Optimized {
    public static Node reverseList(Node head){
        Node temp = head;
        Node front = null;
        Node back;
        while(temp != null){
            back = temp.next;
            temp.next = front;
            front = temp;
            temp= back;

        }
        return front;
    }
      

    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }
        public static void main(String args[]){
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            System.out.print("Given Linked list:");
            printList(head);
            
            head = reverseList(head);

            System.out.print("\nReversed Linked List:");
            printList(head);

        }
}
