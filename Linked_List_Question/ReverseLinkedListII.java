package Linked_List_Question;


//  * Definition for singly-linked list.
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class ReverseLinkedListII {

    public static Node reverseBetween(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

       for(int i = 1 ; i < left ; i++){
        prev= prev.next;
       }
       Node curr = prev.next;
       for(int i = 1 ; i < right- left + 1 ; i++){
        
        Node temp = curr.next;
        curr.next = temp.next;
        temp.next = prev.next;
        prev.next = temp;
       }
       head = dummy.next;
       return head;
    } 
    
    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }  
    }

    public static void main(String args[]){
       Node head = new Node (1);
       head.next = new Node (2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       System.out.println("Given List");
       printList(head);
       int left = 2;
       int right = 4;
        head = reverseBetween(head,left,right);
        System.out.println("Reverse Linked List: ");
        printList(head);

    }
}

