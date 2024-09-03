package Linked_List_Question;


//  class Node {
//     int data;
//     Node next;
//     Node() {}
//     Node(int data) { this.data = data; }
//     Node(int data, Node next) { this.data = data; this.next = next; }
// }

// public class reorderLinkedList {
//     public static void reorderList(Node head) {
//         if(head == null || head.next == null)
//             return;
//         Node mid = middle(head);
        
//         Node temp = reverse(mid.next);
//         System.out.println("Middle : ");
//         printList(mid);
//         System.out.println("Reverse : ");
//         printList(temp);
//         mid.next = null;
//         Node c2 = temp;
//         Node c1 = head;
//         Node f1 = null;
//         Node f2 =null;
//         while(c1 != null && c2 != null){
//             f1 = c1.next;
//             f2 = c2.next;

//             c1.next = c2;
//             c2.next = f1;

//             c1 = f1;
//             c2 = f2;
//         }

//     }  
//     public static Node middle(Node node){
//         Node slow = node;
//         Node fast = node;

//         // System.out.println("Fast :");
//         // printList(fast);
//         while(fast.next != null && fast.next.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             // fast = fast.next.next;
//         }
//         return slow;
//     }
//     public static Node reverse(Node node){
//         Node curr = node;
//         Node prev = null;
//         Node forward = null;
//         while(curr!= null){
//             forward=  curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = forward;          
//         }
//         return node;
//     }
        
    

//     public static void printList(Node node){
//         while(node != null){
//             System.out.print(node.data+ " ");
//             node = node.next;
//         }  
//         System.out.println();
//     }
 
//     public static void main(String args[]){
//         reorderLinkedList rl = new reorderLinkedList();
//         //[2,4,6,8]
//         Node head = new Node (2);
//         head.next = new Node (4);
//         head.next.next = new Node(6);
//         head.next.next.next = new Node(8);
//         head.next.next.next.next = new Node(10);
//         // head.next.next.next.next.next = new Node(6);
//         System.out.println("Given List");
//         printList(head);        
//         // System.out.println("Reverse Linked List: ");
//         reorderList(head);
//         // printList(head);
//     }
// }

class ListNode {
        int data;
        ListNode next;
        ListNode() {}
        ListNode(int data) { this.data = data; }
        ListNode(int data, ListNode next) { this.data = data; this.next = next; }
    }
    
public class reorderLinkedList { 
    static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
        public static void printList(ListNode node){
        while(node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }  
        System.out.println();
    }
    
    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        
        ListNode mid = middle(head);
        ListNode k = reverse(mid.next);
        mid.next = null;
        
        ListNode c1 = head;
        ListNode c2 = k;
        ListNode f1 = null;
        ListNode f2 = null;
        
        while(c1 != null && c2 != null){
            f1 = c1.next;
            f2 = c2.next;
            
            c1.next = c2;
            c2.next = f1;
            
            c1 = f1;
            c2 = f2;
        }
    }
        public static void main(String args[]){
        reorderLinkedList rl = new reorderLinkedList();
        //[2,4,6,8]
        ListNode head = new ListNode (2);
        head.next = new ListNode (4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        // head.next.next.next.next.next = new Node(6);
        System.out.println("Given List");
        printList(head);        
        System.out.println("Reverse Linked List: ");
        reorderList(head);
        printList(head);
    }
}