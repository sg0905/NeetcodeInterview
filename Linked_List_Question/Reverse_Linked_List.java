


/* Time complexity = O(2N) 
    Space Complexity = O(N) ---> As using Stack as external space
*/

package Linked_List_Question;

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class Reverse_Linked_List {
    static Node reverseList(Node head){
        Node temp = head;
        Stack <Integer> st = new Stack<>();

        // Time for this part = O(N)
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        // Time for this part = O(N)
        temp = head;
        while(temp != null){
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
            
        }
        return head;
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


